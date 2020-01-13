import java.awt.*;
import java.awt.image.BufferedImage;

public class Hero extends Character {

    BufferedImage drawImage;
    Character hero = new Character("img/hero-down.png");

    public Hero(){
        super();
        drawImage = hero.image;
        this.healthPoint = 20 + 3 * d6;
        this.defendPoint = 2 * d6;
        this.strikePoint = 5 + d6;
    }

    public void turn(String toTurn){
        if (toTurn.equals("up")) {
            PositionedImage heroUp = new PositionedImage("img/hero-up.png");
            drawImage = heroUp.image;
        } else if (toTurn.equals("down")) {
            PositionedImage heroDown = new PositionedImage("img/hero-down.png");
            drawImage = heroDown.image;
        } else if (toTurn.equals("right")) {
            PositionedImage heroRight = new PositionedImage("img/hero-right.png");
            drawImage = heroRight.image;
        } else if (toTurn.equals("left")) {
            PositionedImage heroLeft = new PositionedImage("img/hero-left.png");
            drawImage = heroLeft.image;
        }
    }

    public void draw(Graphics graphics, int x, int y) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, x, y,null);
        }
    }
    public String status (){
        return "HERO (Level " + hero.level + ") HP: " + hero.healthPoint + "/" + hero.maxHealthPoint + " | DP: " + hero.defendPoint + " | SP: " + hero.strikePoint + "\n";
    }

}
