package Pirates;

import java.util.Random;

public class Pirate {
    String name;
    int goldAmount;
    int healthPoint; //def 10
    boolean haveWoodenLeg;

    public Pirate (){
    }

    public Pirate (String name){
        Random random = new Random();
        this.haveWoodenLeg = random.nextBoolean();
        this.name = name;
        this.healthPoint = 10;
    }

    public int captainWork (){   //if the pirate is a captain
        goldAmount += 10;
        healthPoint -= 5;
        return goldAmount + healthPoint;
    }
    public int captainParty (){  // if the pirate is a captain
        healthPoint += 10;
        return healthPoint;
    }

    public int notCaptainWork (){   //if the pirate is a captain
        goldAmount++;
        healthPoint--;
        return goldAmount + healthPoint;
    }
    public int notCaptainParty (){  // if the pirate is a captain
        healthPoint--;
        return healthPoint;
    }

    public String toString (){
        if (haveWoodenLeg){
            return "Hello, I am " + this.name + ". I have a wooden leg and " + this.goldAmount + " golds.";
        } else {
            return "Hello, I am " + this.name + ". I have my legs and " + this.goldAmount + " golds.";
        }
    }

}
