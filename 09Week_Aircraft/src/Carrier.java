import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private List<Aircraft> aircraftList;
    private int ammoStore;
    private int healthPoint;

    public Carrier(int initialAmmo, int healthPoint) {
        this.ammoStore = initialAmmo;
        this.healthPoint = healthPoint;
        aircraftList = new ArrayList<>();
    }

    public void add(Aircraft aircraftToAdd) {
        aircraftList.add(aircraftToAdd);
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }

    public int getAmmoStore() {
        return ammoStore;
    }

    public void setAmmoStore(int ammoStore) {
        this.ammoStore = ammoStore;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    /*fill
        It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
        If there is not enough ammo then it should start to fill the aircrafts with priority first
        If there is no ammo when this method is called, it should throw an exception*/
    public void fill() {
        //this.getAmmoStore() / aircraftList.size();
        for (int i = 0; i < aircraftList.size(); i++) {
            aircraftList.get(i).getAmmoStorage();
        }
    }

    public void fight() {
    }

    public int totalDamage() {
        int totalDamage = 0;
        for (int i = 0; i < aircraftList.size(); i++) {
            totalDamage += aircraftList.get(i).getDamage();
        }
        return totalDamage;
    }

    public String getStatus() {
        String toString = "";
        toString += "HP: " + this.healthPoint + ", Aircraft count: " + aircraftList.size() + ", Ammo Storage: " + this.ammoStore + ", Total damage: " + this.totalDamage() + "\n";
        for (int i = 0; i < aircraftList.size(); i++) {
            toString += "Type " + aircraftList.get(i).getType() + ", Ammo: " + aircraftList.get(i).getAmmoStorage() + ", Base Damage: " + aircraftList.get(i).getBaseDamage() + ", All Damage: " + aircraftList.get(i).getDamage();
        }
        return toString;
    }

}
