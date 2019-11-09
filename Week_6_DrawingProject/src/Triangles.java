import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int triangleSize = 20;

        //left side to right
        for (int i = 0; i < triangleSize; i++) {
            graphics.drawLine(WIDTH / triangleSize * i, HEIGHT, WIDTH / 2 + WIDTH/ triangleSize * i / 2, HEIGHT / triangleSize * i);
        }

        //right side to left
        for (int i = 0; i <= triangleSize; i++) {
            graphics.drawLine(WIDTH / triangleSize * i, HEIGHT, WIDTH / 2 / triangleSize * i, HEIGHT / triangleSize * (triangleSize - i));
        }

        for (int i = 0; i < triangleSize; i++) {
            graphics.drawLine(WIDTH / triangleSize / 2 * i, HEIGHT / triangleSize * (triangleSize - i), WIDTH / 2 + WIDTH / 2 / triangleSize * (triangleSize - i), HEIGHT / triangleSize * (triangleSize - i));
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