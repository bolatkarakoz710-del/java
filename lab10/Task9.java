import javax.swing.*;
import java.awt.*;

public class Task9 extends JPanel {
    int x = 0;

    public Task9() {
        Timer t = new Timer(50, e -> {
            x += 5;
            repaint();
        });
        t.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new Task9());
        f.setSize(400, 300);
        f.setVisible(true);
    }
}
