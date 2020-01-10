
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    public Board() {
        testBoxX = 1;
        testBoxY = 1;
        setPreferredSize(new Dimension(1100, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(testBoxX, testBoxY, 100, 100);
        PositionedImage image = new PositionedImage("yourimage.png", 300, 300);
        image.draw(graphics);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            testBoxY -= 100;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            testBoxY += 100;
        }
        repaint();

    }

}
