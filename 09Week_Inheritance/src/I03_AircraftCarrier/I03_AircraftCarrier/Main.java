package I03_AircraftCarrier;

public class Main {
    public static void main(String[] args) throws NoAmmoException {
        Carrier carrier1 = new Carrier(100, 70);
        Carrier carrier2 = new Carrier(80, 60);

        F16 sas = new F16();
        F35 tiger = new F35();
        F16 thunder = new F16();
        F35 starFighter = new F35();

        carrier1.add(sas);
        carrier1.add(tiger);
        carrier2.add(thunder);
        carrier2.add(starFighter);

        carrier1.getStatus();
        carrier2.getStatus();

        carrier1.fill();
        carrier2.fill();

        System.out.println("\nFirst fight");
        carrier1.fight(carrier2);
        carrier2.fight(carrier1);
        carrier1.getStatus();
        carrier2.getStatus();

        carrier1.fill();
        carrier2.fill();

        System.out.println("\nSecond fight");
        carrier1.fight(carrier2);
        carrier2.fight(carrier1);
        carrier1.getStatus();
        carrier2.getStatus();

        carrier1.fill();
        carrier2.fill();

        System.out.println("\nThird fight");
        carrier1.fight(carrier2);
        carrier2.fight(carrier1);
        carrier1.getStatus();
        carrier2.getStatus();

        carrier1.fill();
        carrier2.fill();

        System.out.println("\nForth fight");
        carrier1.fight(carrier2);
        carrier2.fight(carrier1);
        carrier1.getStatus();
        carrier2.getStatus();

    }
}
