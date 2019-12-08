import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){

        graphics.setColor(Color.MAGENTA);
        for (int i = 1; i < 10; i++) {
            graphics.drawLine(WIDTH / 10 * i, 0, WIDTH, HEIGHT / 10 * i);
        }

        graphics.setColor(Color.GREEN);
        for (int i = 1; i < 10; i++) {
            graphics.drawLine(0, HEIGHT / 10 * i, WIDTH / 10 * i, HEIGHT);
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
