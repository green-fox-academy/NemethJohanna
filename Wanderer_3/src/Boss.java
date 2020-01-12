import java.awt.*;
import java.awt.image.BufferedImage;

public class Boss extends Character {

    BufferedImage drawImage;
    Character boss = new Character("img/boss.png");
    int xRandomCoordinate;
    int yRandomCoordinate;
    boolean hasKey;

    public Boss() {
        super();
        drawImage = boss.image;
        this.xRandomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
        this.yRandomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
        this.hasKey = true;
    }

    public void draw(Graphics graphics, int xRandomCoordinate, int yRandomCoordinate) {
        if (image != null) {
            graphics.drawImage(image, xRandomCoordinate, yRandomCoordinate, null);
        }
    }

}
