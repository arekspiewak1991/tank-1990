package gameplay;

import tank.UserTank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    public static int MAP_WIDTH = 1000;
    public static int MAP_HEIGHT = 800;
    private boolean play = false;
    private int score = 0;
    private Timer timer;
    private int delay = 0;
    private UserTank userTank;
    private final int step = 10;

    public Gameplay() {

        try {
            userTank = new UserTank("USER");
        } catch (IOException e) {
            e.printStackTrace();
        }
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        this.timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(25, 25, MAP_WIDTH, MAP_HEIGHT);

        userTank.drawTank(g);

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            moveUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            noveDown();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public void moveRight() {
        userTank.setPosX(step);
        System.out.println("X POS: " + userTank.getPosX());
    }

    public void moveLeft() {
        userTank.setPosX(-step);
        System.out.println("X POS: " + userTank.getPosX());
    }

    public void moveUp() {
        userTank.setPosY(-step);
        System.out.println("Y POS: " + userTank.getPosY());
    }

    public void noveDown() {
        userTank.setPosY(step);
        System.out.println("Y POS: " + userTank.getPosY());
    }
}
