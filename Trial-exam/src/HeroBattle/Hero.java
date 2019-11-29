package HeroBattle;

public class Hero {

    private String name;
    private double motivation;

    public Hero(String name, double motivation){
        this.name = name;
        this.motivation = getMotivation();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMotivation() {
        return motivation;
    }

    public void setMotivation(double motivation) {
        this.motivation = motivation;
    }


    public int getMotivationLevel (){
        if (motivation < 25) {
            return 0;
        } else if (motivation < 40) {
            return 1;
        } else {
            return 2;
        }
    }

    public punch (Hero name){
        motivation -= motivation / (double)1.5;
        this.name.bePunched;
    }

    public bePunched () {
        motivation -= damage / motivation;
    }
}

