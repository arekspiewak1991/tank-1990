import gameplay.Gameplay;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private static int WINDOW_WIDHT = 1200;
    private static int WINDOW_HEIGHT = 900;

    public static void main(String[] args) {
        Gameplay gameplay = new Gameplay();
        JFrame jFrame = new JFrame("Tank 1990");
        jFrame.setBounds(10, 10, WINDOW_WIDHT, WINDOW_HEIGHT);
        jFrame.setBackground(Color.DARK_GRAY);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gameplay);
    }
}
