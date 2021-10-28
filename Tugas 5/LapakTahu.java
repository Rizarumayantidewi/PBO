import java.util.*;

public class LapakTahu {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      
      System.out.print("- - - - - Tahu Bikini Bottom - - - - - ");
      System.out.println();
      System.out.print("Masukan jumlah uang Anda untuk membeli tahu : ");
      
      int uangMasuk = input.nextInt();
      int jumlahTahu = 35;

      System.out.print("- - - - - - - - - - - - - -  - - - - - ");
      System.out.println();
      
      if (uangMasuk < 2000) {
        System.out.println("Maaf harga tahu 2000, uang anda tidak cukup");
      }

      tampilRak(uangMasuk);
    }

    catch (InputMismatchException e) {
      System.out.println("Input harus angka");
    }

  }
  public static void formatRack(String[][] rack) {
    for (String[] barisRak: rack) {
      for (int r = 0; r < barisRak.length; r++) {
        if (r == 0) {
          System.out.print(barisRak[r] + " ");
        }

        if (r == 1 || r == 2 || r == 4 || r == 5) {
          System.out.print(barisRak[r]);
        } 

        if (r == 3) {
          System.out.print(" " + barisRak[r] + " ");
        }

        if (r == 6) {
          System.out.print(" " + barisRak[r]);
        }

      }

      System.out.println();
    }
  }

  public static void tampilRak(int uangMasuk) {
    final int defaultTotalHarga = 70000;
    int uangMasukRemain = (uangMasuk % 2000);
    int totalHarga = defaultTotalHarga - (uangMasuk - uangMasukRemain);
    int totalTahuTerbeli = 0;
    String[][] finalRack = new String[5][7];

    for (int k = finalRack.length - 1; k >= 0; k--) {
      for (int r = finalRack[k].length - 1; r >= 0; r--) {
        if (totalHarga >= 2000 && totalHarga % 2000 == 0) {
          finalRack[k][r] = "#";
        } else {
          finalRack[k][r] = " ";
          totalTahuTerbeli++;
        }
        totalHarga -= 2000;
      }
    }

    String konfirmasiPembelian = "Anda mendapat " + totalTahuTerbeli + " tahu";

    if (uangMasuk >= defaultTotalHarga) {
      konfirmasiPembelian += ", uang kembalian " + (uangMasuk - defaultTotalHarga);
    }

    if (uangMasuk % 2000 != 0) {
      konfirmasiPembelian += ", uang kembalian " + uangMasukRemain;
    }


    System.out.println(konfirmasiPembelian);
    formatRack(finalRack);
  }


}
