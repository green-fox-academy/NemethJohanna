import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawImage implements Drawable {

    BufferedImage image;
    int posX, posY;

    public DrawImage() {
    }

    public DrawImage(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void draw(Graphics graphics, int posX, int posY) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }
    }
}
