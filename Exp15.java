import java.awt.event.*;
import javax.swing.*;

public class Exp14WordCharacterCount {
    public static void main(String[] args) {
        JFrame f = new JFrame("Word Count");
        f.setSize(360, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel l1 = new JLabel("Words");
        l1.setBounds(30, 40, 100, 30);
        f.add(l1);

        final JLabel l2 = new JLabel("Characters");
        l2.setBounds(170, 40, 120, 30);
        f.add(l2);

        final JTextArea a = new JTextArea("Welcome to java");
        a.setBounds(50, 90, 200, 200);
        f.add(a);

        JButton b = new JButton("Count word & character");
        b.setBounds(90, 300, 160, 30);
        f.add(b);

        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = a.getText().trim();
                String[] words = text.isEmpty() ? new String[0] : text.split("\\s+");
                l1.setText("Words: " + words.length);
                l2.setText("Characters: " + text.length());
            }
        });
    }
}
