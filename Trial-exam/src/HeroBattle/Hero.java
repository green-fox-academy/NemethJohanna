package HeroBattle;

public class Hero {

    String name;
    double motivation;

    public Hero(String name, int motivation) {
        this.name = name;
        this.motivation = motivation;
    }

    public int getMotivationLevel(){
        if (this.motivation < 25){
            return 0;
        } else if (this.motivation > 25 && this.motivation < 40){
            return 1;
        } else {
            return 2;
        }
    }

    public void punch(Hero heroToPunch){
        if (this.getMotivationLevel() >= 1){
        double damage = this.motivation /= 1.5;
            heroToPunch.bePunched(damage);
        }
    }

    public void bePunched(double damage){
        this.motivation -= (damage / motivation);
    }

    @Override
    public String toString(){
        String toString = "";
        if (this.getMotivationLevel() == 0){
            toString = this.name + " is not motivated anymore.";
        } else if (this.getMotivationLevel() == 1){
            toString = this.name + " is motivated.";
        } else  if (this.getMotivationLevel() == 2){
            toString = this.name + " is well motivated.";
        }
        return toString;
    }
}

