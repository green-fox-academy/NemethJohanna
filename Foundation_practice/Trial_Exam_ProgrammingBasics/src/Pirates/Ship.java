package Pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ship {

    /*Ship
It should have a list of pirates.
You must be able to add new pirates to the ship. It must have only one captain!
You must create the following methods:
getPoorPirates() which returns a list of names containing the pirates that
    have a wooden leg and have less than 15 golds
getGolds() which returns the sum of gold owned by the pirates of that particular ship
lastDayOnTheShip() which calls the pirates' party() method.
prepareForBattle() which calls
    - the pirates' work() method 5 times
    - then the ship's lastDayOnTheShip() method.*/

    public List<Pirate> pirateList;
    Pirate captain = new Pirate();

    public Ship(){
        this.pirateList = new ArrayList<>();
    }

    public void addPirates(){               // a hajó kap egy kapitányt és több kalózt
        this.captain = new Pirate();
        this.pirateList = new ArrayList<>();
        for (int i = 0; i < (int)(Math.random() * 50); i++) {
            this.pirateList.add(new Pirate());
        }
    }

    //getPoorPirates() which returns a list of names containing the pirates that
    //    have a wooden leg and have less than 15 golds
    public List<String> getPoorPirates(){
        List<String> poorPirates = new ArrayList<>();
        for (int i = 0; i < pirateList.size(); i++) {
            if (pirateList.get(i).haveWoodenLeg && pirateList.get(i).goldAmount < 15){
                poorPirates.add(pirateList.get(i).name);
            }
        }
        return poorPirates;
    }

    //getGolds() which returns the sum of gold owned by the pirates of that particular ship
    public int getGolds(String shipName){
        int sumOfGold = 0;
        for (int i = 0; i < shipName.length(); i++) {
            sumOfGold++;
        }
        return sumOfGold;
    }

    //lastDayOnTheShip() which calls the pirates' party() method.
    public void lastDayOnTheShip (){
        //party()
    }
//    public void prepareForBattle (){
//        for (int i = 0; i <= 5; i++) {
//            Pirate.work;
//        }
//        for (int i = 0; i <= 1; i++) {
//            lastDayOnTheShip();
//        }
//    }
}
