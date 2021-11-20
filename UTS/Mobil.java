import java.util.Arrays;

public class Mobil {
  String merk,tipe;
  boolean nyala = false;
  String status;
  int porseneling;
  int kecepatan;

  Mobil(String merk, String tipe_mobil) {
    this.merk = merk;
    this.tipe = tipe_mobil;
  }

  public void tambahKecepatan (int Kecepatan){
    this.kecepatan = this.kecepatan + Kecepatan;
  }
  public void kurangKecepatan (int Kecepatan){
    this.kecepatan = this.kecepatan - Kecepatan;
  }
  public int getKecepatan (){
    return this.kecepatan;
  }
  void infoKecepatan (){
    System.out.println("Kecepatan Mobil : " + this.kecepatan);
  }
  public String getStatus(){
      if(this.kecepatan == 0) {
        this.status = "Mobil sedang berhenti";
      } else if (this.kecepatan >= 1 && this.kecepatan <= 50) {
        this.status = "Mobil berjalan lambat";
      } else if (this.kecepatan >= 51 && this.kecepatan <= 70) {
        this.status = "Mobil berjalan sedang";
      } else {
        this.status = "Mobil berjalan cepat";
      }

      return this.merk + " : " + this.status;
  }

  public static void main (String [] args){
      Mobil mobilku = new Mobil("Toyota","Avanza");
      System.out.println(mobilku.getStatus());
      mobilku.infoKecepatan();
      
      mobilku.tambahKecepatan(50);
      System.out.println(mobilku.getStatus());
      mobilku.infoKecepatan();
      
       mobilku.tambahKecepatan(50);
      System.out.println(mobilku.getStatus());
      mobilku.infoKecepatan();
      
       mobilku.kurangKecepatan(100);
      System.out.println(mobilku.getStatus());
      mobilku.infoKecepatan();
    }
  }
