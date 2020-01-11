import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SkeletonList extends Character {

    BufferedImage drawImage;
    //Character skeleton = new Character("img/skeleton.png");

    Skeleton skeleton1 = new Skeleton();
    Skeleton skeleton2 = new Skeleton();
    Skeleton skeleton3 = new Skeleton();

    List<Skeleton> skeletonList;

    public SkeletonList(){
        skeletonList = new ArrayList<>();
        skeletonList.add(skeleton1);
        skeletonList.add(skeleton2);
        skeletonList.add(skeleton3);
        this.xCoordinate = (int) (Math.random() * 11);
        this.yCoordinate = (int) (Math.random() * 11);
    }

    public void draw(Graphics graphics) {
        if (drawImage != null) {
            graphics.drawImage(drawImage, xCoordinate, yCoordinate,null);
        }
    }

}
