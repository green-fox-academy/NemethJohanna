public class BattleApp {

    public static void main(String[] args) {

        Ship ship1 = new Ship("Ship1");
        Ship ship2 = new Ship("Ship2");

        ship1.fillShip();
        ship2.fillShip();
        ship1.battle(ship2);

    }
}
