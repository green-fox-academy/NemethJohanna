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
    int level;

    public SkeletonList(int level){
        super();
        this.level = level;
        skeletonList = new ArrayList<>();
        skeletonList.add(skeleton1);
        skeletonList.add(skeleton2);
        skeletonList.add(skeleton3);
        for (int i = 0; i < skeletonList.size(); i++) {
            //skeletonList.get(i).xRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
            //skeletonList.get(i).yRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
            drawImage = skeletonList.get(i).skeleton.image;
        }
    }

    public void draw(Graphics graphics) {
        for (int i = 0; i < skeletonList.size(); i++) {
            //skeletonList.get(i).xRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
            //skeletonList.get(i).yRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
            if (drawImage != null) {
                skeletonList.get(i).xRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
                skeletonList.get(i).yRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
                //int xRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
                //int yRandomCoordinate = (int)((Math.random() * 10) + 1) * 72;
                graphics.drawImage(drawImage, xRandomCoordinate, yRandomCoordinate,null);
            }
        }
    }

}
