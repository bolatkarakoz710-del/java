import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends JPanel {
    int x, y;

    public Task6() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 5, 5);
        g.drawString("X=" + x + " Y=" + y, 10, 20);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new Taskk6());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}