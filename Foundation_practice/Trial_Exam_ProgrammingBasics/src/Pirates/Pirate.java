package Pirates;

public class Pirate {

    private String name;
    private int goldAmount;
    private int healthPoints;
    private boolean isCaptain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        this.goldAmount = goldAmount;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
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

    public void setHaveWoodenLeg(boolean haveWoodenLeg) {
        this.haveWoodenLeg = haveWoodenLeg;
    }

    private boolean haveWoodenLeg;

    public Pirate(String name) {
        this.name = name;
        this.healthPoints = 10;
    }

    public void work() {
        if (this.isCaptain == true) {
            this.goldAmount += 10;
            this.healthPoints -= 5;
        }
        else {
            this.goldAmount++;
            this.healthPoints--;
        }
    }

    public void party(){
        if (this.isCaptain == true){
            this.healthPoints += 10;
        } else {
            this.healthPoints++;
        }
    }

    @Override
    public String toString(){
        String toString = "";
            if (this.haveWoodenLeg == true){
                toString += "Hello, I'm " + this.name + ". I have a wooden leg and " + this.goldAmount + " golds.";
            } else {
                toString += "Hello, I'm " + this.name + ". I still have my real legs and " + this.goldAmount + " golds.";
            }
        return toString;
    }
}
