package map;

import gameplay.Gameplay;

import javax.swing.*;
import java.awt.*;

public class Map {
    private int width;
    private int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.drawMap();
    }

    private void drawMap() {
        JFrame jFrame = new JFrame("Tank 1990");

        jFrame.setBounds(10, 10, this.width, this.height);
        jFrame.setBackground(Color.DARK_GRAY);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
