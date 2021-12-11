public class Kendaraan {
    public static void main(String[] args) {v
      Sepeda simerah = new Sepeda("simerah", 4, "gowes");
      Mobil r3 = new Mobil("r3", 2, "pertamax");
      Motor revo = new Motor("revo", 3, "premium");
  
      System.out.println("Suara sepeda saya : " + simerah.suara());
      System.out.println("Suara mobil saya : " + r3.suara());
      System.out.println("Suara motor saya : " + revo.suara());
    }
  }
 
   class Sepeda extends Kendaraan {
    protected String name;
    protected String value;
    protected int weight;

    Sepeda(String name, int weight, String value) {
      this.name = name;
    }
    public String value() {
      return this.value;
    }
  
    public String suara() {
      return "weessweessgowes";
    }
}
  class Mobil extends Sepeda {
    Mobil(String name, int weight, String value) {
      super(name, weight, value);
    }
  
    @Override
    public String suara() {
      return "vroomvroomm";
    }

  }
  
  class Motor extends Mobil{
    Motor(String name, int weight, String value) {
      super(name, weight,value);
    }
  
    @Override
    public String suara() {
      return "ngenggg";
    }
  
  }
