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
        this.healthPoint = 2 * level * d6 + d6;
        this.defendPoint = level / 2 * d6 + d6 / 2;
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

    public String status (){
        return "BOSS (Level " + boss.level + ") HP: " + boss.healthPoint + "/" + boss.maxHealthPoint + " | DP: " + boss.defendPoint + " | SP: " + boss.strikePoint + "\n";
    }

}
