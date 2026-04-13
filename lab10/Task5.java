import javax.swing.*;
import java.awt.*;

public class Task5 extends JPanel {
    int x = 50, y = 50;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Taskk5 panel = new Taskk5();

        JTextField tfX = new JTextField();
        JTextField tfY = new JTextField();
        JButton btn = new JButton("Салу");

        tfX.setBounds(10, 10, 50, 30);
        tfY.setBounds(70, 10, 50, 30);
        btn.setBounds(130, 10, 80, 30);

        btn.addActionListener(e -> {
            panel.x = Integer.parseInt(tfX.getText());
            panel.y = Integer.parseInt(tfY.getText());
            panel.repaint();
        });

        f.setLayout(null);
        f.add(tfX);
        f.add(tfY);
        f.add(btn);
        f.add(panel);

        panel.setBounds(0, 50, 300, 300);

        f.setSize(300, 350);
        f.setVisible(true);
    }
}