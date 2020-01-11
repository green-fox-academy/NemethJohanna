import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");

    public Skeleton(){
        super();
        drawImage = skeleton.image;
    }

}
