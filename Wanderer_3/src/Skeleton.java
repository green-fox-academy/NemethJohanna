import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");
    int xRandomCoordinate;
    int yRandomCoordinate;

    public Skeleton() {
        super();
        drawImage = skeleton.image;
        while (xRandomCoordinate == 0 && yRandomCoordinate == 0) {
            xRandomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
            yRandomCoordinate = (int) ((Math.random() * 10) + 1) * 72;
        }
    }

}
