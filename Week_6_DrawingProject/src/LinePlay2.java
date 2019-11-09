import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.drawLine(WIDTH / 2, 0, WIDTH / 2 , HEIGHT / 2);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(WIDTH / 2, HEIGHT / 2, WIDTH / 2 , HEIGHT );
        graphics.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);


        graphics.setColor(Color.RED);
        for (int i = 0; i < 10; i++) {
            graphics.drawLine(WIDTH / 2 / 10 * i, HEIGHT / 2, WIDTH / 2,HEIGHT / 2 / 10 * (10 - i));

        }

        graphics.setColor(Color.BLUE);
        for (int i = 0; i < 10; i++) {
            graphics.drawLine(WIDTH / 2 ,HEIGHT / 2 / 10 * (10 - i), HEIGHT / 2 + HEIGHT / 2 / 10 * (10 - i), HEIGHT / 2);
        }

        graphics.setColor(Color.GREEN);
        for (int i = 0; i < 10; i++) {
            graphics.drawLine(HEIGHT / 2 + HEIGHT / 2 / 10 * (10 - i), HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + HEIGHT / 2 / 10 * i);
        }

        graphics.setColor(Color.cyan);
        for (int i = 0; i < 10; i++) {
            graphics.drawLine(WIDTH / 2, HEIGHT / 2 + HEIGHT / 2 / 10 * i, WIDTH / 2 / 10 * i, HEIGHT / 2);
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

