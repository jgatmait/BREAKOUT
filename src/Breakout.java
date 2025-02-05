//https://zetcode.com/javagames/breakout/ 10.01.2023

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class Breakout extends JFrame {


    public Breakout() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setTitle("Breakout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Breakout();
            game.setVisible(true);
        });
    }
}