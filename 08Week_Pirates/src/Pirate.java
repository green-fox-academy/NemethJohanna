public class Pirate {

// Create a Pirate class. While you can add other fields and methods, you must have these methods:-

            int drinkLevel;
            boolean isAlive;

// drinkSomeRum() - intoxicates the Pirate some
            public void drinkSomeRum(){
                drinkLevel++;
            }

// howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
// 0 to 4 times, "Pour me anudder!"
// else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.

            public void howsItGoingMate() {
                if (drinkLevel <= 4) {
                    System.out.println("Pour me anudder!");
                } else {
                    System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its going?");
                    isAlive = false;
                }
            }

// die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.

            public void die(){
          this.isAlive = false;
    }

// brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance,
// 1 dies, the other dies or they both pass out.

            public void brawl(Pirate pirate1, Pirate pirate2){
                if (pirate1.isAlive || pirate2.isAlive && ){
                    pirate1.die() || pirate2.die();
                }
            }

}
