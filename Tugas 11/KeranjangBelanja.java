import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;


public class KeranjangBelanja {
  private int maxAmount = 0;
  private int currentIndex = 0;
  private String[] items = new String[1];

  void setMaxItemAmount(int maxAmount) {
    this.maxAmount = maxAmount;
    this.items = new String[this.maxAmount];
  }

  void addItem(String item) throws ArrayIndexOutOfBoundsException {
    this.items[this.currentIndex] = item;
    this.currentIndex++;
  }

  String[] getItems() {
    return this.items;
  }
  
  public static void main(String[] args) {
    KeranjangBelanja keranjangBelanja = new KeranjangBelanja();
    Scanner jumlahItemHandler = new Scanner(System.in);
    Scanner productInput = new Scanner(System.in);
    Scanner statusInput = new Scanner(System.in);
    boolean addingProduct = true;

    System.out.print("Mau belanja berapa produk ? : ");
    int jumlahMaksimalProduk = jumlahItemHandler.nextInt();
    keranjangBelanja.setMaxItemAmount(jumlahMaksimalProduk);
    System.out.println(jumlahMaksimalProduk);

    try {
      while(addingProduct) {
        System.out.println();
        System.out.println("=======================");
        System.out.println("[1] Tambah produk ");
        System.out.println("[2] Keluar ");
        System.out.println("=======================");
        System.out.println();

        System.out.print("Pilih : ");
        int decision = statusInput.nextInt();

        if (decision == 1) {
          System.out.print("Masukan nama produk      : ");
          String produk = productInput.nextLine();
          keranjangBelanja.addItem(produk);

          System.out.println("PRODUK DITAMBAHKAN");
        }

        if (decision == 2) {
          addingProduct = false;
        }
      }

    } catch (InputMismatchException err) {
      System.out.println("Jangan masukan apapun selain angka");
    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("Keranjang belanja Anda sudah penuh");
    } finally {
      System.out.println("Isi keranjang belanja Anda : " + Arrays.deepToString(keranjangBelanja.getItems()));
    }
  }
}
