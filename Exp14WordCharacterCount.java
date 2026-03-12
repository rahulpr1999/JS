import java.awt.event.*;
import javax.swing.*;

public class expp15 {
    public static void main(String[] ags) {
        JFrame f = new JFrame("Word Country");
        f.setSize(360, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel l1 = new JLabel("Words");
        l1.setBounds(30, 40, 80, 30);
        f.add(l1);

        final JLabel l2 = new JLabel("Characters");
        l1.setBounds(170, 40, 80, 30);
        f.add(l2);

        final JTextArea a = new JTextArea("Welcome to java");
        a.setBounds(50, 90, 200, 200);
        f.add(a);

        JButton b = new JButton("Count word & character");
        b.setBounds(90, 300, 120, 30);
        f.add(b);

        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = a.getText();
                String words[] = text.split("\\s");
                l1.setText("words:" + words.length);
                l2.setText("characters:" + text.length());
            }
        });
    }
}
