import java.awt.*;
import java.awt.image.BufferedImage;

public class Hero extends Character {

    BufferedImage drawImage;
    Character hero = new Character("img/hero-down.png");


    public Hero(){
        super();
        this.x = 1;
        this.y = 1;
        drawImage = hero.image;
    }

    public void draw(Graphics graphics) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, x * 72, y * 72,null);
        }
    }

}
