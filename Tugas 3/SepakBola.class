
import java.util.Scanner;

public class SepakBola {
    public static void main(String[] args) {
        
        Scanner p = new Scanner(System.in);
        
        System.out.println("Masukkan nomor punggung Anda : ");
        int nomor = p.nextInt();
        String posisi = "";
        System.out.println();
        
        // nomor punggung genap
        if (nomor %2 == 0 ){
            posisi += "Target Attaker";
        
            if(nomor >= 50 && nomor <= 100){
                posisi += " dan berhak dipilih menjadi Captain Team";
            }
        }

        // nomor punggung ganjil
        if (nomor %2 == 1){
            posisi += "Defender";
        
            if(nomor >= 90){
                posisi += " atau Playmaker";
            }
        }
        
        
        //ganjil kelipatan 3 & 5
        if (nomor % 3 == 0 || nomor % 5 ==0 ){
            posisi += " atau Keeper";
        }

        System.out.println("anda bisa berada di posisi " + posisi);
    }
    
}
