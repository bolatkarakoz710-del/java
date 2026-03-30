import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);

        g.drawRect(50, 50, 100, 60);
        g.drawString("Тіктөртбұрыш", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Шеңбер", 200, 45);

        g.drawLine(50, 150, 200, 150);
        g.drawString("Сызық", 50, 170);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task1");
        f.add(new Task1());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
