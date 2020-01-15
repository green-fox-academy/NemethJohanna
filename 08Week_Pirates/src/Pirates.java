public class Pirates {

    private int drinkLevel;
    private boolean isAlive;

    public Pirates() {
        this.drinkLevel = 0;
        this.isAlive = true;
    }

    public void drinkSomeRum() {
        drinkLevel++;
    }

    public void howsItGoingMate() {
        if (this.drinkLevel <= 4) {
            System.out.println("Pour me anudder!");
        } else if (drinkLevel < 0) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its going?");
            isAlive = false;
        }
    }

    public void die() {
        this.isAlive = false;
        System.out.println("He is dead!");
    }

    public void brawl(Pirates pirateToFightWith) {
        if (this.isAlive && pirateToFightWith.isAlive) {
            int chance = (int) (Math.random() * 3);
            if (chance == 0) {
                this.die();
            } else if (chance == 2) {
                pirateToFightWith.die();
            } else {
                this.die();
                pirateToFightWith.isAlive = false;
            }
        }
        else {
            System.out.println("One of the pirate died, they can not fight");
        }
    }

    public int getDrinkLevel() {
        return drinkLevel;
    }

    public void setDrinkLevel(int drinkLevel) {
        this.drinkLevel = drinkLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
