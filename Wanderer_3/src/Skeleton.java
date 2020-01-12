import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");
    int xRandomCoordinate;
    int yRandomCoordinate;
    boolean hasKey;

    public Skeleton() {
        super();
        drawImage = skeleton.image;
        this.xRandomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
        this.yRandomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
        
    }

}
