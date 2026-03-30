import javax.swing.*;
import java.awt.event.*;

public class Task2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton btn = new JButton("Бас");
        JLabel label = new JLabel();

        btn.setBounds(50, 50, 100, 30);
        label.setBounds(50, 100, 200, 30);

        btn.addActionListener(e -> label.setText("Hello Java"));

        f.add(btn);
        f.add(label);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
