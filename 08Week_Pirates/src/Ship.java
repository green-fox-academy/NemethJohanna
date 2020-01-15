import java.util.ArrayList;
import java.util.List;

public class Ship {

    private Pirates captain = new Pirates();
    private List<Pirates> crew;
    private String name;
    private int score;

    public Ship(String name) {
        this.name = name;
        this.crew = new ArrayList<>();
        this.score = 0;
    }

    public void fillShip() {
        crew.add(captain);
        int randomSizeOfCrew = (int) (Math.random() * 11);
        for (int i = 1; i < randomSizeOfCrew; i++) {
            this.crew.add(new Pirates());
        }
    }

    public boolean battle(Ship otherShip) {
        if (this.score() > otherShip.score()) {
            this.party();
            System.out.println(this.name + " won");
            return true;
        } else {
            for (int i = 0; i < randomNumber() + 1; i++) {
                otherShip.crew.get(randomNumber() - 1).setAlive(false);
            }
            return false;
        }
    }

    public int score() {
        int stillAliveCrew = 0;
        int score = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            if (crew.get(i).isAlive()) {
                stillAliveCrew++;
            }
        }
        score = stillAliveCrew - captain.getDrinkLevel();
        return score;
    }

    public int randomNumber() {
        return (int) (Math.random() * 11);
    }

    public void party() {
        this.captain.setDrinkLevel(randomNumber());
        for (int i = 0; i < this.crew.size(); i++) {
            crew.get(i).setDrinkLevel(randomNumber());
        }
    }

}
