package Pirates;

public class Pirate {

    private String name;
    private int goldAmount;
    private int healthPoints;
    private boolean isCaptain;
    private boolean haveWoodenLeg;

    public Pirate(String name) {
        this.name = name;
        this.healthPoints = 10;
    }

    public void work() {
        if (this.isCaptain) {
            this.goldAmount += 10;
            this.healthPoints -= 5;
        }
        else {
            this.goldAmount++;
            this.healthPoints--;
        }
    }

    public void party(){
        if (this.isCaptain){
            this.healthPoints += 10;
        } else {
            this.healthPoints++;
        }
    }

    public String getName() {
        return name;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public boolean isHaveWoodenLeg() {
        return haveWoodenLeg;
    }

    @Override
    public String toString(){
        String toString = "";
            if (this.haveWoodenLeg){
                toString += "Hello, I'm " + this.name + ". I have a wooden leg and " + this.goldAmount + " golds.";
            } else {
                toString += "Hello, I'm " + this.name + ". I still have my real legs and " + this.goldAmount + " golds.";
            }
        return toString;
    }
}
