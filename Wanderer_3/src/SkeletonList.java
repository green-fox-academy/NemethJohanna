import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SkeletonList extends Skeleton {

    BufferedImage drawImage;

    Skeleton skeleton1 = new Skeleton();
    Skeleton skeleton2 = new Skeleton();
    Skeleton skeleton3 = new Skeleton();

    List<Skeleton> skeletonList;

    public void SkeletonList(){
        skeletonList = new ArrayList<Skeleton>();
        skeletonList.add(skeleton1);
        skeletonList.add(skeleton2);
        skeletonList.add(skeleton3);
    }

    public void draw(Graphics graphics, int x, int y) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, x, y,null);
        }
    }

}
