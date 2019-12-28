package I03_AircraftCarrier;

public class NoAmmoException extends Exception {
    public NoAmmoException() {
        System.out.println("There is no more ammo, storage is empty.");
    }
}
