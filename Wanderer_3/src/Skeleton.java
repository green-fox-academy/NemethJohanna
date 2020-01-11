import java.awt.*;
import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");

    public Skeleton(){
        super();
        this.xCoordinate = (int) (Math.random() * 720);
        this.yCoordinate = (int) (Math.random() * 720);
        drawImage = skeleton.image;
    }

    public void draw(Graphics graphics, int xCoordinate, int yCoordinate) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, this.xCoordinate, this.yCoordinate,null);
        }
    }

}
