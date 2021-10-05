package Tugas2;

public class bitwise {
    public static void main(String[] args) {
        System.out.println("A. 100 & 20 ");
        System.out.println("******************");
        System.out.println(convertByteToBinaryString((byte) 100) + " - " + 100);
        System.out.println(convertByteToBinaryString((byte) 20) + " - " + 20);
        System.out.println("         =     ");
        System.out.println(convertByteToBinaryString((byte) (100 & 20)) + " - " + (byte) (100 & 20));
        System.out.println("******************");
        //dalam logika AND setiap nilai 1 dalam binary yang sejajar
        //maka akan menghasilkan 1
        
        System.out.println();

        System.out.println("B. 528 | 70 ");
        System.out.println("******************");
        System.out.println(convertByteToBinaryString((byte) 528) + " - " + 528);
        System.out.println(convertByteToBinaryString((byte) 70) + " - " + 70);
        System.out.println("         =     ");
        System.out.println(convertByteToBinaryString((byte) (528 | 70)) + " - " + (byte) (528 | 70));
        System.out.println("******************");
        //dalam logika OR setiap ada nilai 1 dalam binary pada tiap baris
        //maka akan menghasilkan 1
        
        System.out.println();

        System.out.println("C. 256 >> 3 ");
        System.out.println("******************");
        System.out.println(convertByteToBinaryString((byte) 256) + " - " + 256);
        System.out.println(convertByteToBinaryString((byte) 3) + " - " + 3);
        System.out.println("         =     ");
        System.out.println(convertByteToBinaryString((byte) (256 >> 3)) + " - " + (byte) (256 >> 3));
        System.out.println("******************");
        //dalam operator ini << dan >> akan menggeser posisi 1 ke kanan atau ke kiri
        //sesuai dengan jenis operator dan jumlah yang telah ditentukan
    
        System.out.println();

        System.out.println("D. 600 >> 4 ");
        System.out.println("******************");
        System.out.println(convertByteToBinaryString((byte) 600) + " - " + 600);
        System.out.println(convertByteToBinaryString((byte) 4) + " - " + 4);
        System.out.println("         =     ");
        System.out.println(convertByteToBinaryString((byte) (600 >> 4)) + " - " + (byte) (600 >> 4));
        System.out.println("******************");
    
        System.out.println();

        System.out.println("E. 423 << 2 ");
        System.out.println("****************************************");
        System.out.println(convertByteToBinaryString((byte) 423) + " - " + 423);
        System.out.println(convertByteToBinaryString((byte) 2) + " - " + 2);
        System.out.println("         =     ");
        System.out.println(convertByteToBinaryString((byte) (423 << 2)) + " - " + (byte) (423 << 2));
        System.out.println("****************************************");
        
        System.out.println();

        System.out.println("F. 1 << 2 ");
        System.out.println("******************");
        System.out.println(convertByteToBinaryString((byte) 1) + " - " + 1);
        System.out.println(convertByteToBinaryString((byte) 2) + " - " + 2);
        System.out.println("         =     ");
        System.out.println(convertByteToBinaryString((byte) (1 << 2)) + " - " + (byte) (1 << 2));
        System.out.println("******************");
        
    }

        public static String convertByteToBinaryString(byte numberInByte) {
            return String.format("%8s",Integer.toBinaryString(numberInByte)).replace(' ', '0');
        }

        public static int convertStringBytesToNumber(String byteNumberInString) {
            int result = 0;
            String reversedByteNumberInString = new StringBuilder(byteNumberInString)
              .reverse()
              .toString();
        
            for (int r = 0; r < reversedByteNumberInString.length(); r++) {
              int currentNumber = Integer.parseInt(
                String.valueOf(
                 reversedByteNumberInString.charAt(r)
                )
              );
        
              if (currentNumber == 1) {
                result += (int) Math.pow(2, r); 
              }
            }
        
            return result;
          }
        }
