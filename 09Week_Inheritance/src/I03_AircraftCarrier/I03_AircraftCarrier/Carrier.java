package I03_AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private String name;
    private int healthPoints;
    private int storedAmmo;
    private int totalDamage;
    private List<Aircraft> aircrafts;

    public Carrier(int storedAmmo, int healthPoints) {
        this.storedAmmo = storedAmmo;
        this.healthPoints = healthPoints;
        aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    public void fill() throws NoAmmoException {
        for (Aircraft aircraft : aircrafts) {
            aircraft.refill(storedAmmo);
            storedAmmo -= aircraft.getActualAmmo();
        }
    }

    public void fight(Carrier carrier) {
        for (Aircraft aircraft : aircrafts) {
            totalDamage = aircraft.getActualAmmo();
            carrier.healthPoints -= totalDamage;
            aircraft.setActualAmmo(0);
        }
    }

    public void getStatus() {
        if (healthPoints <= 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.printf("HP: %d, Aircraft count: %d, Ammo Storage: %d, Total damage: %d\n", healthPoints, aircrafts.size(), storedAmmo, totalDamage);
            for (Aircraft aircraft : aircrafts) {
                aircraft.getStatus();
            }
        }
    }

}
