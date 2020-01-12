import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX, testBoxY, randomCoordinate;
    Grid grid = new Grid();
    Hero hero = new Hero();
    SkeletonList skeletonList = new SkeletonList(1);
    Boss boss = new Boss();

    public Board() {
        testBoxX = 1;
        testBoxY = 1;
        randomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
        setPreferredSize(new Dimension(1100, 864));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        grid.draw(graphics);
        hero.draw(graphics, testBoxX * 72, testBoxY * 72);
        skeletonList.draw(graphics);
        boss.draw(graphics, randomCoordinate, randomCoordinate);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WANDERER Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
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
            hero.turn("up");
            if (grid.grid[testBoxX][testBoxY - 1] != grid.wall)
                testBoxY -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.turn("down");
            if (grid.grid[testBoxX][testBoxY + 1] != grid.wall)
                testBoxY += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.turn("right");
            if (grid.grid[testBoxX + 1][testBoxY] != grid.wall)
                testBoxX += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.turn("left");
            if (grid.grid[testBoxX - 1][testBoxY] != grid.wall)
                testBoxX -= 1;
        }
        repaint();
    }

}