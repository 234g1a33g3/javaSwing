import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main
{
    public static void main(String[] args) {
        Addition a = new Addition();

    }
}
class Addition extends JFrame implements ActionListener
{
    JTextField t1;
    JTextField t2;
    JLabel l;
    JButton b;
    Addition()
    {

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l = new JLabel("RESULT");
        b = new JButton("OK");
        add(t1);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent shiva)
    {
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value = num1 + num2;
         l.setText(value + "");
    }
}