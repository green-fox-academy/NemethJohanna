import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SkeletonList {

    BufferedImage drawImage;
    List<Skeleton> skeletonList;
    int level;
    boolean hasKey = false;

    public SkeletonList(int level, Grid grid){
        skeletonList = new ArrayList<>();
        skeletonList.add(new Skeleton(grid));
        skeletonList.add(new Skeleton(grid));
        skeletonList.add(new Skeleton(grid));
        for (int i = 0; i < skeletonList.size(); i++) {
            drawImage = skeletonList.get(i).skeleton.image;
        }
        for (int i = 0; i < skeletonList.size(); i++) {
            skeletonList.get((int)(Math.random() * skeletonList.size())).hasKey = true;
            break;
        }
    }

    public void draw(Graphics graphics) {
        for (int i = 0; i < skeletonList.size(); i++) {
            if (drawImage != null) {
                graphics.drawImage(drawImage, skeletonList.get(i).xRandomCoordinate, skeletonList.get(i).yRandomCoordinate,null);
            }
        }
    }

}
