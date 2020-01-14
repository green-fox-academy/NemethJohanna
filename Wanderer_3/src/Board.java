import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int xHero, yHero;
    Grid grid = new Grid();
    Hero hero = new Hero();
    SkeletonList skeletonList = new SkeletonList(1, grid);
    Boss boss = new Boss(grid);

    public Board() {
        xHero = 1;
        yHero = 1;
        setPreferredSize(new Dimension(1200, 864));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        grid.draw(graphics);
        hero.draw(graphics, xHero * 72, yHero * 72);
        skeletonList.draw(graphics);
        boss.draw(graphics);
        graphics.drawString(hero.status(), 850, 85);
        graphics.drawString(boss.status(), 850, 115);
        int x = 850;
        int y = 145;
        for (int i = 0; i < skeletonList.list.size(); i++) {
            graphics.drawString(skeletonList.list.get(i).status(), x, y + i * 30);
        }
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
            if (grid.grid[xHero][yHero - 1] != grid.wall)
                yHero -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.turn("down");
            if (grid.grid[xHero][yHero + 1] != grid.wall)
                yHero += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.turn("right");
            if (grid.grid[xHero + 1][yHero] != grid.wall)
                xHero += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.turn("left");
            if (grid.grid[xHero - 1][yHero] != grid.wall)
                xHero -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (xHero == boss.xRandomCoordinate / 72 && yHero == boss.yRandomCoordinate / 72) {
                hero.battle(boss);
            }
            for (int i = 0; i < skeletonList.list.size(); i++) {
                if ((xHero == skeletonList.list.get(i).xRandomCoordinate / 72) && (yHero == skeletonList.list.get(i).yRandomCoordinate / 72)) {
                    hero.battle(skeletonList.list.get(i));
                }
            }
        }
        repaint();
    }

}