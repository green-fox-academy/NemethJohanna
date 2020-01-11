import java.awt.*;
import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");

    public Skeleton(){
        super();
        this.xCoordinate = 1;
        this.Coordinate = 1;
        drawImage = skeleton.image;
    }

    public void draw(Graphics graphics, int x, int y) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, x, y,null);
        }
    }

}
