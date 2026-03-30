import javax.swing.*;

public class Task3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JTextField tf = new JTextField();
        JButton btn = new JButton("OK");
        JLabel label = new JLabel();

        tf.setBounds(50, 50, 150, 30);
        btn.setBounds(50, 100, 100, 30);
        label.setBounds(50, 150, 200, 30);

        btn.addActionListener(e ->
                label.setText("Сәлем, " + tf.getText())
        );

        f.add(tf);
        f.add(btn);
        f.add(label);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
