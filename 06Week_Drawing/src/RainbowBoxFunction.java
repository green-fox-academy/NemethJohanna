import javax.swing.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void square (int size, Color color, Graphics graphics){
        graphics.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256) ));
        graphics.fillRect(WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, size, size);
    }

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        for (int i = 7; i > 0; i--) {
            square(WIDTH / 7 * i, Color.RED , graphics);
        }

        /*square(WIDTH / 8 * 7, Color.RED, graphics);
        square(WIDTH / 8 * 6, Color.ORANGE, graphics);
        square(WIDTH / 8 * 5, Color.YELLOW, graphics);
        square(WIDTH / 8 * 4, Color.GREEN, graphics);
        square(WIDTH / 8 * 3, Color.BLUE, graphics);
        square(WIDTH / 8 * 2, Color.MAGENTA, graphics);
        square(WIDTH / 8 * 1, Color.PINK, graphics);*/

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
