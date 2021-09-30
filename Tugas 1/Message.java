package Tugas1;
import javax.swing.*;

public class Message {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?","Input",1);
        JOptionPane.showMessageDialog(null,"Belajar "+ input +" sangat mudah","Message",1);
    }
    
}