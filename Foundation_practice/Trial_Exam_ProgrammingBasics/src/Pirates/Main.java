package Pirates;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pirate pirate1 = new Pirate("pirate1");
        Pirate pirate2 = new Pirate("pirate2");
        Pirate pirate3 = new Pirate("pirate3");

        Ship ship = new Ship();
        ship.addPirate(pirate1);
        ship.addPirate(pirate2);
        ship.addPirate(pirate3);

        pirate1.work();
        pirate2.work();
        pirate3.work();
        pirate2.work();

        System.out.println(pirate1);
        System.out.println(pirate2);
        System.out.println(pirate3);
        System.out.println();
        System.out.println(ship.getPoorPirates());

       // ship.getGolds();



    }
}
