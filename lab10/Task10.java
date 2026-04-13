import javax.swing.*;
import java.awt.*;

public class Task10 extends JPanel {
    Color color = Color.RED;

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Taskk10 panel = new Taskk10();

        JCheckBox red = new JCheckBox("Red");
        JCheckBox green = new JCheckBox("Green");
        JCheckBox blue = new JCheckBox("Blue");

        red.addActionListener(e -> panel.color = Color.RED);
        green.addActionListener(e -> panel.color = Color.GREEN);
        blue.addActionListener(e -> panel.color = Color.BLUE);

        JPanel top = new JPanel();
        top.add(red);
        top.add(green);
        top.add(blue);

        f.add(top, BorderLayout.NORTH);
        f.add(panel, BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}