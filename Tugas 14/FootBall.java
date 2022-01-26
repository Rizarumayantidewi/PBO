import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.object.AnimatedSprite;
import com.golden.gamedev.object.Background;
import com.golden.gamedev.object.GameFont;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.SpriteGroup;
import com.golden.gamedev.object.Timer;
import com.golden.gamedev.object.background.ImageBackground;
import com.golden.gamedev.object.collision.BasicCollisionGroup;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class FootBall extends Game {

    Background background;
    Sprite gawang_kiri,gawang_kanan;
    AnimatedSprite asPlayer;
    boolean isRun = false;
    GameFont font;
    int score = 0;
    Timer waktu;
    SpriteGroup group_bola = new SpriteGroup("BOLA");
    SpriteGroup group_player = new SpriteGroup("PLAYER");
    SpriteGroup group_gawang = new SpriteGroup("GAWANG");

    CollidePlayerWithBall collide1;
    CollideBallWithGawang collide2;
    Sprite ball;
    String moving;

    int scroreA = 0;
    int scroreB = 0;
    
    @Override
    public void initResources() {
      background = new ImageBackground(getImage("Resources/background.jpg"), 800, 600);
      gawang_kiri = new Sprite(getImage("Resources/gawang_kiri.png"),0,235);
      gawang_kanan = new Sprite(getImage("Resources/gawang_kanan.png"), 640, 235);
      
      BufferedImage [] images_player = getImages("Resources/player.png",2,1);
      asPlayer = new AnimatedSprite(images_player,390,270);
      
      font = fontManager.getFont(getImages("Resources/font.png",20,3),"!            ,.0123456789:   -? ABCDEFGHIJKLMNOPQRSTUVWXYZ ");


      
      waktu= new Timer(3000);
      group_player.add(asPlayer);
      group_gawang.add(gawang_kiri);
      group_gawang.add(gawang_kanan);

      
      collide1 = new CollidePlayerWithBall();
      collide1.setCollisionGroup(group_player, group_bola);
    
      collide2=new CollideBallWithGawang();
      collide2.setCollisionGroup(group_bola, group_gawang);
    
      acak();
    }

    public void acak(){
        Sprite ball= new Sprite(getImage("Resources/red.png"),getRandom(200,600),10);
        ball.setVerticalSpeed(0.2);
        this.ball = ball;
        group_bola.add(ball);
        
    }
    
    @Override
    public void update(long elapsedTime) {
        
        collide1.checkCollision();
        collide2.checkCollision();
        
        if(waktu.action(elapsedTime)){
            acak();
        };

        group_bola.update(elapsedTime);

        if(keyDown(KeyEvent.VK_LEFT) && keyDown(KeyEvent.VK_UP)){
            if(isRun==false){
            asPlayer.setAnimationFrame(0,0);
            asPlayer.setSpeed(-0.2, -0.2);
            asPlayer.update(elapsedTime);
            isRun = true;
            }
        }
        if(keyDown(KeyEvent.VK_LEFT) && keyDown(KeyEvent.VK_DOWN)){
            if(isRun==false){
            asPlayer.setAnimationFrame(0,0);
            asPlayer.setSpeed(0.2, 0.2);
            asPlayer.update(elapsedTime);
            isRun = true;
            }
        }
       
        
        
        if(keyDown(KeyEvent.VK_LEFT)){
            if(isRun==false){
                asPlayer.setAnimationFrame(0,0);
                asPlayer.setSpeed(-0.2, 0);
                asPlayer.update(elapsedTime);
                isRun = true;
            }

            this.moving = "LEFT";
        }
        
        else if(keyDown(KeyEvent.VK_RIGHT)){
             if(isRun==false){
                asPlayer.setAnimationFrame(1,1);
                asPlayer.setSpeed(0.2, 0);
                asPlayer.update(elapsedTime);
                isRun = true; 
             }
             this.moving = "RIGHT";
        }
        else if(keyDown(KeyEvent.VK_UP)){
            if(isRun==false){
                //asPlayer.setAnimationFrame(1,1 );
                asPlayer.setSpeed(0, -0.2);
                asPlayer.update(elapsedTime);
                isRun = true; 
            }
        }
        else if(keyDown(KeyEvent.VK_DOWN)){
            if(isRun==false){
                //asPlayer.setAnimationFrame(1,1);
                asPlayer.setSpeed(0, 0.2);
                asPlayer.update(elapsedTime);
                isRun = true; 
            }
        }
        
        isRun = false;
    }

    @Override
    public void render(Graphics2D gd) {
       background.render(gd);
       font.drawString(gd,"SCORE: "+ score,5,5);
       gawang_kiri.render(gd);
       gawang_kanan.render(gd);
       asPlayer.render(gd);
       group_bola.render(gd);
       
    }
  
    public static void main (String [] args){
        GameLoader game = new GameLoader();
        game.setup(new FootBall(), new Dimension(900,600), false);
        game.start();
    }
    
    class CollidePlayerWithBall extends BasicCollisionGroup{
        public CollidePlayerWithBall(){
            
        }

        @Override
        public void collided(Sprite player, Sprite ball) {
            if(moving == "LEFT") {
                ball.setSpeed(-0.2,0);
            } else if (moving == "RIGHT") {
                ball.setSpeed(0.2,0);
            }
        }
        
    }
    class CollideBallWithGawang extends BasicCollisionGroup{

        public CollideBallWithGawang(){
        
        }
        
        @Override
        public void collided(Sprite ball, Sprite gawang) {
           ball.setActive(false);           

           if(moving == "LEFT") {
            scroreA += 10;
           } else if(moving == "RIGHT") {
            scroreB += 10;
           }

           System.out.println("Score A " +  scroreA);
           System.out.println("Score B " +  scroreB);

           if(scroreA >= 200) {
               System.out.println("TIM A MENANG");
           } else if(scroreB >= 200) {
               System.out.println("TIM B MENANG");
           }
        }
        
    }
}
