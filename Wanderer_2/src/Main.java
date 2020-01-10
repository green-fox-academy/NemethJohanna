import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    Grid grid = new Grid();
    Hero hero = new Hero();

    public Main() {
        testBoxX = 1;
        testBoxY = 1;
        setPreferredSize(new Dimension(1100, 864));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        grid.draw(graphics);
        hero.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Wanderer Game");
        Main board = new Main();
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
            hero.move("up");
            if (grid.grid[testBoxX][testBoxY - 1] != grid.wall)
                testBoxY -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.move("down");
            if (grid.grid[testBoxX][testBoxY + 1] != grid.wall)
                testBoxY += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.move("right");
            if (grid.grid[testBoxX + 1][testBoxY] != grid.wall)
                testBoxX += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.move("left");
            if (grid.grid[testBoxX - 1][testBoxY] != grid.wall)
                testBoxX -= 1;
        } //else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        //}
        repaint();

    }

}
