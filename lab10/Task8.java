import javax.swing.*;

public class Task8 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JButton btn = new JButton("+");
        JLabel res = new JLabel();

        a.setBounds(50, 50, 50, 30);
        b.setBounds(120, 50, 50, 30);
        btn.setBounds(80, 100, 50, 30);
        res.setBounds(50, 150, 200, 30);

        btn.addActionListener(e -> {
            int sum = Integer.parseInt(a.getText()) + Integer.parseInt(b.getText());
            res.setText("Жауап: " + sum);
        });

        f.setLayout(null);
        f.add(a);
        f.add(b);
        f.add(btn);
        f.add(res);

        f.setSize(300, 250);
        f.setVisible(true);
    }
}
