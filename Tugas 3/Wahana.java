
import java.util.Scanner;

public class Wahana {

    private static int tarif;
    public static void main(String[] args) {
    Scanner d = new Scanner(System.in);
      
    // input
    System.out.println("Masukkan umur anak : ");
    int umur = d.nextInt();
    System.out.println("Masukkan tinggi badan anak : ");
    int tinggi = d.nextInt();
    
    // sesuai kriteria  
    if ( umur <= 3 & umur >= 1 || tinggi <= 70 ) {
        tarif = 30000;
  
        if (tinggi >= 70) {
          tarif += 10000;
        }
      }
  
      if ( umur <= 7 & umur >= 4  || tinggi <= 120) {
        tarif = 40000;
  
        if (tinggi >= 120) {
          tarif += 15000;
        }
      }
 
      if ( umur <= 10 & umur >= 8 || tinggi <= 150) {
        tarif = 50000;
  
        if (tinggi >= 150) {
          tarif += 20000;
        }
      }
  
      if ( umur >= 10 ) {
        tarif = 80000;
      }
  
    String sesuai = "Tarif harga : " + "Rp " + tarif ;
    String tdksesuai = "Dilarang masuk";
  
    // dilarang masuk
    if ( umur <= 1 ) {
        System.out.println(tdksesuai);
    } else{
        System.out.println(sesuai);
    }
