public class Tree extends Plant {

    public Tree(String color){
        this.setColor(color);
        this.setAbsorbLevel(0.4);
        this.setType("Tree");
    }

    @Override
    public boolean needWater() {
        return getCurrentWater() < 10;
    }
}
