package Tugas3;

import java.util.Scanner;

public class NomorPunggung{
    public static void main(String[]args){
        Scanner r = new Scanner(System.in);
        double kaloriYangDibakar = 0;
        final int lari = 60/5;
        final double pushup = 200.0/30.0;
        final int plank = 5/1;
        
        System.out.print("Isikan kalori awal :");
        System.out.println();
        int kalori_awal = r.nextInt();
        
        
        System.out.print("Anda memilih lari? Y/T :");
        System.out.println();
        String Aktivitas1 = r.next();
      
        if(Aktivitas1.toUpperCase().equals("Y")){
        System.out.print("Waktu lari :");
        System.out.println();
        int waktuLari = r.nextInt();
        kaloriYangDibakar = kaloriYangDibakar + lari *waktuLari;
        System.out.print("Jumlah kalori setelah melakukan aktivitas : " + lari + " kalori");
        System.out.println();
        }
        
        
        System.out.print("Anda memilih push-up? Y/T :");
        System.out.println();
        String Aktivitas2 = r.next();
        
        if(Aktivitas2.toUpperCase().equals("Y")){
        System.out.print("Waktu push-up :");
        System.out.println();
        int waktuPushup = r.nextInt();
        kaloriYangDibakar = kaloriYangDibakar + pushup *waktuPushup;
        System.out.print("Jumlah kalori setelah melakukan aktivitas : " + pushup + " kalori");
        System.out.println();
        }
        
        
        System.out.print("Anda memilih plank? Y/T : ");
        System.out.println();
        String Aktivitas3 = r.next();
        
        if(Aktivitas3.toUpperCase().equals("Y")){
        System.out.print("Waktu plank :");
        System.out.println();
        int waktuPlank = r.nextInt();
        kaloriYangDibakar = kaloriYangDibakar + plank *waktuPlank;
        System.out.print("Jumlah kalori setelah melakukan aktivitas : " + plank + " kalori");
        System.out.println();
        }
        
    }
}
