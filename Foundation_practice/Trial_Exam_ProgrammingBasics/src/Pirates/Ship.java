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
            if (pirateList.get(i).isCaptain() == false){
                pirateToAdd.setCaptain(true);
            }
            pirateList.add(pirateToAdd);
        }
        pirateList.add(pirateToAdd);
    }

    public List<String> getPoorPirates() {
        List<String> poorPiratesList = new ArrayList<>();
        for (int i = 0; i < pirateList.size(); i++) {
            if (pirateList.get(i).isHaveWoodenLeg() && pirateList.get(i).getGoldAmount() < 15) {
                poorPiratesList.add(pirateList.get(i).getName());
            }
        }
        return poorPiratesList;
    }

    public int getGolds() {
        int sumOfGold = 0;
        for (int i = 0; i < pirateList.size(); i++) {
            sumOfGold += pirateList.get(i).getGoldAmount();
        }
        return sumOfGold;
    }

    public void lastDayOnTheShip(){
        for (int i = 0; i < pirateList.size(); i++) {
            pirateList.get(i).party();
        }
    }

    public void prepareForBattle(){
        for (int i = 0; i < pirateList.size(); i++) {
            for (int j = 0; j < 5; j++) {
                pirateList.get(i).work();
            }
           this.lastDayOnTheShip();
        }
    }


}
