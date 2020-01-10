import java.util.ArrayList;
import java.util.List;

public class Skeleton extends Character {

    List<Skeleton> skeletonList;

    public Skeleton() {
        skeletonList = new ArrayList<>();
    }

    public void add(Skeleton skeleton){
        this.skeletonList.add(skeleton);
    }
}
