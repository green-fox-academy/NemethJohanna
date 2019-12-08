package I02_GardenApplication;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
        this.setAbsorbLevel(0.4);
        this.setThirstyLevel(10);
        this.setType("tree");
    }

}
