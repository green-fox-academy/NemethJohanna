import java.awt.*;
import java.awt.image.BufferedImage;

public class Hero extends Character {

    BufferedImage drawImage;

    public Hero(){
        super();
        PositionedImage heroDown = new PositionedImage("img/hero-down.png");
        drawImage = heroDown.image;
    }

    public void draw(Graphics graphics, int posX, int posY) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }

}
