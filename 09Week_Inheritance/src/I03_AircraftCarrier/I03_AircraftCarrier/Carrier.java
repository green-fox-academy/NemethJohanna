package I03_AircraftCarrier;

public class Carrier {

    Aircraft aircraft1 = new Aircraft();
    Aircraft aircraft2 = new Aircraft();

    //It should take a new aircraft and add it to its storage
    public void add (){    }

    // It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
    // If there is not enough ammo then it should start to fill the aircrafts with priority first
    // If there is no ammo when this method is called, it should throw an exception.
    public void fill(){}

    // It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it,
    // then subtract all the damage from its health points
    public void fight(String carrier){}


    // It should return a string about itself and all of its aircrafts' statuses in the following format:
    public void getStatus(){}


}
