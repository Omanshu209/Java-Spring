import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Color;

public class FirstSwingApp
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("A Swing Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.getContentPane().setBackground(Color.GREEN);
    frame.setLayout(new GridLayout(3, 1));

    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridLayout(1, 2));
    JLabel label1 = new JLabel("ID : ");
    label1.setForeground(Color.BLUE);
    label1.setOpaque(true);
    label1.setBackground(Color.YELLOW);
    panel1.add(label1);
    JTextField textField1 = new JTextField(15);
    panel1.add(textField1);
    frame.add(panel1);

    JPanel panel2 = new JPanel();
    panel2.setLayout(new GridLayout(1, 2));
    JLabel label2 = new JLabel("PW : ");
    label2.setForeground(Color.RED);
    label2.setOpaque(true);
    label2.setBackground(Color.PINK);
    panel2.add(label2);
    JTextField textField2 = new JTextField(15);
    panel2.add(textField2);
    frame.add(panel2);

    JButton button = new JButton("Login");
    frame.add(button);

    frame.setVisible(true);
  }
}
