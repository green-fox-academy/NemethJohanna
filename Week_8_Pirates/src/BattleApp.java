public class BattleApp {
    /*Create a BattleApp class with a main method
Create 2 ships, fill them with pirates
Have a battle!*/
    public static void main(String[] args) {

        Ship ship1 = new Ship("Ship1");
        Ship ship2 = new Ship("Ship2");

        ship1.fillShip();
        ship2.fillShip();

        ship1.captain.drinkSomeRum();
        ship2.captain.drinkSomeRum();
        ship1.captain.drinkSomeRum();
        ship1.captain.drinkSomeRum();



        ship1.captain.howsItGoingMate();

    }
}