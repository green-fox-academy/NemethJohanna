import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SkeletonList extends Skeleton {

    BufferedImage drawImage;
    Skeleton skeleton1 = new Skeleton();
    Skeleton skeleton2 = new Skeleton();
    Skeleton skeleton3 = new Skeleton();
    // Boss boss = new Boss();
    List<Skeleton> skeletonList;
    int level;

    public SkeletonList(int level){
        super();
        this.level = level;
        skeletonList = new ArrayList<>();
        skeletonList.add(skeleton1);
        skeletonList.add(skeleton2);
        skeletonList.add(skeleton3);
        for (int i = 0; i < skeletonList.size(); i++) {
            drawImage = skeletonList.get(i).skeleton.image;
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
