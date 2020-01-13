import java.awt.*;
import java.awt.image.BufferedImage;

public class Boss extends Character {

    BufferedImage drawImage;
    Character boss = new Character("img/boss.png");
    int xRandomCoordinate;
    int yRandomCoordinate;
    boolean hasKey;

    public Boss(Grid grid) {
        super();
        drawImage = boss.image;
        this.hasKey = true;
        while (grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] == grid.wall) {
            this.xRandomCoordinate = (int) (Math.random() * 11) * 72;
            this.yRandomCoordinate = (int) (Math.random() * 11) * 72;
        }
    }

    public void draw(Graphics graphics) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, this.xRandomCoordinate, this.yRandomCoordinate, null);
        }
    }

}
