
import java.util.Scanner;

public class teksPalindrome {

    public static void main(String[] args) {
    
        Scanner r = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        System.out.println();
        String text = r.nextLine();
        
        String ReversedText = "";
        for(int k = text.length() - 1; k>= 0; k--){
            ReversedText += text.substring(k, k+1);  
        }
        if(ReversedText.equals(text)){
            System.out.println("Text ( " + text +" ) adalah Palindrome");
        }else{
            System.out.println("Text ( " + text +" ) bukan Palindrome");
        }

    }
    
}
