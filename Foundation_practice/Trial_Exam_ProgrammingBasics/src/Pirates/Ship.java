package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Pirate> pirateList;

    public Ship() {
        this.pirateList = new ArrayList<>();
    }

    public void addPirate(Pirate pirateToAdd) {
        for (int i = 0; i < pirateList.size(); i++) {
            if (!pirateList.get(i).isCaptain()){
                pirateToAdd.setCaptain(true);
            }
            pirateList.add(pirateToAdd);
        }
    }

    public List<String> getPoorPirates() {
        List<String> poorPiratesList = new ArrayList<>();
        for (Pirate pirate : pirateList) {
            if (pirate.isHaveWoodenLeg() && pirate.getGoldAmount() < 15) {
                poorPiratesList.add(pirate.getName());
            }
        }
        return poorPiratesList;
    }

    public int getGolds() {
        int sumOfGold = 0;
        for (Pirate pirate : pirateList) {
            sumOfGold += pirate.getGoldAmount();
        }
        return sumOfGold;
    }

    public void lastDayOnTheShip(){
        for (Pirate pirate : pirateList) {
            pirate.party();
        }
    }

    public void prepareForBattle(){
        for (Pirate pirate : pirateList) {
            for (int j = 0; j < 5; j++) {
                pirate.work();
            }
            this.lastDayOnTheShip();
        }
    }


}
