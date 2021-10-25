
import java.util.*;

public class LapakBuah  {

  public static void main(String args[]){
	   ArrayList<String> listoffruit = new ArrayList<String>();
	     listoffruit.add("Apel");
	     listoffruit.add("Pisang");
       listoffruit.add("Jambu");
       listoffruit.add("Anggur");
       listoffruit.add("Pepaya");
       listoffruit.add("Dukuh");
       listoffruit.add("Durian");
       listoffruit.add("Jeruk");
       listoffruit.add("Mangga");
       listoffruit.add("Manggis");
	   
	   Collections.sort(listoffruit);

  	System.out.println("Mengelompokkan buah sesuai dengan kesamaan huruf awalnya :");
	     for(String buah: listoffruit){
		      System.out.println("=> " + buah);
       }
    }
}
