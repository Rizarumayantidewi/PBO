
import java.util.Scanner;

public class CalonProgrammer {

    private static int nilaiCoding;
    public static void main(String[] args) {
        
        Scanner k = new Scanner(System.in);
        
        System.out.print("Masukkan nilai test coding :");
        System.out.println();
        String nilaiCoding = "";
        int scoreCoding = k.nextInt();
        
        System.out.print("Masukkan nilai test interview :");
        System.out.println();
        String nilaiInterview = "";
        int scoreInterview = k.nextInt();
        

        if ( scoreCoding > 80 ) {
            nilaiCoding = "LOLOS";
        }

        else if ( scoreCoding > 60 & scoreCoding < 80 ) {
            nilaiCoding = "DIPERTIMBANGKAN";
        }

        
        if ( scoreInterview > 80 ) {
            nilaiInterview = "A";
        }

        else if ( scoreInterview > 60 & scoreInterview < 80 ) {
            nilaiInterview = "B";
        }

        else if ( scoreCoding < 60 ) {
            nilaiInterview = "GAGAL";
        }
        
        if ((nilaiCoding == "LOLOS" || nilaiCoding == "DIPERTIMBANGKAN") &&
        (nilaiInterview == "A" || nilaiInterview == "B")) {
            System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
        } else {
            System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
        }
    }
}
