import java.awt.*;
import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");

    public Skeleton(){
        super();
        //this.xCoordinate = (int) (Math.random() * 11);
        //this.yCoordinate = (int) (Math.random() * 11);
        drawImage = skeleton.image;
    }

    public void draw(Graphics graphics) {
        if (drawImage != null) {
            int xCoordinate = (int)((Math.random() * 10) + 1) * 72;
            int yCoordinate = (int)((Math.random() * 10) + 1) * 72;
            graphics.drawImage(drawImage, xCoordinate, yCoordinate,null);
        }
    }

}
