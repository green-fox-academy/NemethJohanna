import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void fillBlackRect (int x, int y, Graphics graphics) {
        graphics.fillRect(x, y, 50, 50);
    }

    public static void fillWhiteRect (int x, int y, Graphics graphics) {
        //  graphics.setColor(Color.white);
        graphics.fillRect(x, y, 50, 50);
    }


    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        for (int i = 0; i < WIDTH; i++) {
            fillBlackRect(i * 50, i * 50, graphics);
        }
        graphics.setColor(Color.MAGENTA);
        for (int i = 0; i < WIDTH; i++) {
            fillWhiteRect(i, 100 * 50, graphics);

        }
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
