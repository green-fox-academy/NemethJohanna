import java.awt.image.BufferedImage;

public class Character extends DrawImage {

    int xCoordinate;
    int yCoordinate;

    BufferedImage drawImage;

    public Character(String filename) {
        super(filename);
    }

    public Character() {
        super();
    }
}
