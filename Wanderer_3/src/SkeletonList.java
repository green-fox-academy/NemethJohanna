import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SkeletonList {

    BufferedImage drawImage;
    List<Skeleton> list;
    // int level;

    public SkeletonList(int level, Grid grid){
        list = new ArrayList<>();
        list.add(new Skeleton(grid));
        list.add(new Skeleton(grid));
        list.add(new Skeleton(grid));
        for (int i = 0; i < list.size(); i++) {
            drawImage = list.get(i).skeleton.image;
        }
        for (int i = 0; i < list.size(); i++) {
            list.get((int)(Math.random() * list.size())).hasKey = true;
            break;
        }
    }

    public void draw(Graphics graphics) {
        for (int i = 0; i < list.size(); i++) {
            //if (list.get(i).isDead = false) {
                if (drawImage != null) {
                    graphics.drawImage(drawImage, list.get(i).xRandomCoordinate, list.get(i).yRandomCoordinate, null);
                }
            //}
        }
    }

}
