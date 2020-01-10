import java.awt.*;
import java.awt.image.BufferedImage;

public class Hero extends Character implements Drawable {

    BufferedImage drawImage;

    Character hero = new Character("img/hero-down.png");

    public Hero() {
        super();
        this.xCoordinate = 1;
        this.yCoordinate = 1;
        drawImage = hero.image;
    }

    public void move(String direction){
        if (direction.equals("up")) {
            Character heroUp = new Character("img/hero-up.png");
            drawImage = heroUp.image;
        } else if (direction.equals("down")) {
            Character heroDown = new Character("img/hero-down.png");
            drawImage = heroDown.image;
        } else if (direction.equals("right")) {
            Character heroRight = new Character("img/hero-right.png");
            drawImage = heroRight.image;
        } else if (direction.equals("left")) {
            Character heroLeft = new Character("img/hero-left.png");
            drawImage = heroLeft.image;
        }
    }

    @Override
    public void draw(Graphics graphics) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, xCoordinate * 72, yCoordinate * 72,null);
        }
    }


}
