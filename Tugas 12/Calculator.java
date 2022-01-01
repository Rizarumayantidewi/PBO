import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    JTextField input = new JTextField();

    JButton satu = new JButton("1");
    JButton dua = new JButton("2");
    JButton tiga = new JButton("3");
    JButton empat = new JButton("4");
    JButton lima = new JButton("5");
    JButton enam = new JButton("6");
    JButton tujuh = new JButton("7");
    JButton delapan = new JButton("8");
    JButton sembilan = new JButton("9");
    JButton nol = new JButton("0");

    JButton tambah = new JButton("+");
    JButton kurang = new JButton("-");
    JButton kali = new JButton("*");
    JButton bagi = new JButton("/");
    JButton samaDengan = new JButton("=");
    JButton persen = new JButton("%");
    JButton modulo = new JButton("Mod");
    JButton exit = new JButton("Exit");

    Calculator() {
        super("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.cyan);
        setLocationRelativeTo(null);
        JPanel operatorPanel = new JPanel();

        operatorPanel.setLayout(new GridLayout(3, 6));
        operatorPanel.add(satu);
        operatorPanel.add(dua);
        operatorPanel.add(tiga);
        operatorPanel.add(empat);
        operatorPanel.add(lima);
        operatorPanel.add(enam);
        operatorPanel.add(tujuh);
        operatorPanel.add(delapan);
        operatorPanel.add(sembilan);
        operatorPanel.add(nol);
        operatorPanel.add(tambah);
        operatorPanel.add(kurang);
        operatorPanel.add(kali);
        operatorPanel.add(bagi);
        operatorPanel.add(samaDengan);
        operatorPanel.add(persen);
        operatorPanel.add(modulo);
        operatorPanel.add(exit);

        this.setLayout(new GridLayout(2, 1));
        this.add(input);
        this.add(operatorPanel);
    }

    public static void main(String[] args) {
        Calculator Calculator = new Calculator();

    }

}
