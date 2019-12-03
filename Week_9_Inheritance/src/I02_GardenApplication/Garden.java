package I02_GardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private String name;
    private List<Tree> trees;
    private List<Flower> flowers;

    public Garden(String name){
        this.name = name;
        trees = new ArrayList<>();
        flowers = new ArrayList<>();
    }

    public void addTrees(Tree tree){
        trees.add(tree);
    }
    public void addFlowers(Flower flower){
        flowers.add(flower);
    }
    

    public void watering (int wateringAmount){
        if ()
    }

}
