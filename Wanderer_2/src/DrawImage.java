import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawImage implements Drawable{

    BufferedImage image;
    int posX, posY;

    public DrawImage(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public DrawImage() {

    }

    @Override
    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }

    public void draw(Graphics graphics, int posX, int posY) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }

}
