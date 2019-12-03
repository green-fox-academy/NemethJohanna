package I02_GardenApplication;

public class Flower extends Plant {

    public Flower(String color) {
        super();
    }

    public Flower(String color, int currentWaterAmount, double absorbLevel, int needWateringLimit) {
        super(color, currentWaterAmount, absorbLevel, needWateringLimit);
        this.setAbsorbLevel(0.75);
        this.setNeedWateringLimit(5);
        this.setType("flower");
    }

    public void isThirsty(){
        if (getCurrentWaterAmount() < 5){
            System.out.println(" needs water.");
        } else {
            System.out.println(" doesn't need water.");
        }
    }

    public void introduce (){
        System.out.printf("The %s %s", getColor(), getType());

    }
}
