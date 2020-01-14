import java.awt.*;
import java.awt.image.BufferedImage;

public class Boss extends Character {

    BufferedImage drawImage;
    Character boss = new Character("img/boss.png");
    int xRandomCoordinate;
    int yRandomCoordinate;

    public Boss(Grid grid) {
        super();
        drawImage = boss.image;
        this.hasKey = true;
        this.isAlive = true;
        this.healthPoint = 2 * level * d6 + d6;
        this.defendPoint = 2 * d6 + d6 / 2;
        this.strikePoint = level * d6 + level;
        while (grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] == grid.wall || (grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] != (grid.grid[1][1]))) {
            this.xRandomCoordinate = (int) (Math.random() * 11) * 72;
            this.yRandomCoordinate = (int) (Math.random() * 11) * 72;
        }
    }

    public void draw(Graphics graphics) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, this.xRandomCoordinate, this.yRandomCoordinate, null);

        }
    }

    public String status() {
        return "BOSS       (Level " + this.level + ") HP: " + this.healthPoint + " | DP: " + this.defendPoint + " | SP: " + this.strikePoint + "\n";
    }

}
