package I02_GardenApplication;

public class Tree extends Plant {

    public Tree (String color){
        super();
    }

    public Tree (String color, int currentWaterAmount, double absorbLevel, int needWateringLimit) {
        super(color, currentWaterAmount, absorbLevel, needWateringLimit);
        this.setAbsorbLevel(0.4);
        this.setNeedWateringLimit(10);
        this.setType("tree");
    }


}
