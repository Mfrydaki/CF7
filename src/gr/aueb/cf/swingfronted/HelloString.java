package gr.aueb.cf.ch22.swingfronted;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class HelloString {
    public static void main(String[] args) {
        JFrame JFrame = new JFrame();

        JFrame.setTitle("First Swing App");
        JFrame.setSize(600, 300);
        JFrame.setLocationRelativeTo(null); // κεντρική στοίχιση
        JFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        JFrame.setContentPane(contentPane);

        contentPane.add(new JLabel("Hello World"));
        JFrame.setVisible(true);
    }
}
