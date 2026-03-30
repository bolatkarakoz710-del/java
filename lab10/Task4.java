import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends JPanel {
    Color color = Color.RED;

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.fillOval(100, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Task4 panel = new Task4();

        JButton btn = new JButton("Түс өзгерту");
        btn.addActionListener(e -> {
            if (panel.color == Color.RED) panel.color = Color.GREEN;
            else if (panel.color == Color.GREEN) panel.color = Color.BLUE;
            else panel.color = Color.RED;
            panel.repaint();
        });

        f.add(panel, BorderLayout.CENTER);
        f.add(btn, BorderLayout.SOUTH);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
