import java.util.ArrayList;

public class Armada {

    ArrayList<Ship> ships;

    public Armada(){
        ships = new ArrayList<>();
    }

    public boolean war(Armada otherArmada){
        for (int i = 0; i < this.ships.size(); i++) {
            for (int j = 0; j < otherArmada.ships.size(); j++) {
                this.ships.get(i).battle(otherArmada.ships.get(i));
            }
        }

        if (this.ships.size() > otherArmada.ships.size()){
            System.out.println(this.toString() + " won");
            return true;
        } else {
            System.out.println(this.toString() + " lost");
            return false;
        }

    }


}
