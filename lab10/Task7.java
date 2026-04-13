import javax.swing.*;
import java.awt.event.*;

public class Task7 extends JFrame {
    JLabel label = new JLabel();

    public Task7() {
        label.setBounds(50, 50, 200, 30);
        add(label);

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                label.setText("Символ: " + e.getKeyChar());
            }
        });

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Taskk7();
    }
}