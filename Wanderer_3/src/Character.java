public class Character extends PositionedImage {

    double healthPoint;
    double defendPoint;
    double strikePoint;
    int xRandomCoordinate;
    int yRandomCoordinate;
    int level = 1;
    int d6 = (int) (Math.random() * 6) + 1;
    boolean isAlive;
    boolean hasKey;

    public Character(String filename) {
        super(filename);
    }

    public Character() {
        super();
    }

        /*When a hero enters a tile which is occupied by a monster, a battle forms.
        The character entering the occupied tile is the attacker.
        When the player hits space his hero strikes on the defender and then it strikes back.
        After a won battle if the character is a hero, it levels up.*/

    public void battle(Character defender) {
        //if ((this.xRandomCoordinate == defender.xRandomCoordinate) && (this.yRandomCoordinate == defender.yRandomCoordinate) && ((this.strikePoint + 2 * d6) > defender.healthPoint)) {
            this.strike(defender);
            defender.strike(this);
            if (this.healthPoint <= 0) {
                System.out.println(this.getClass() + " GAME OVER");
            } else if (defender.healthPoint <= 0) {
                defender.isAlive = false;
            }
        //}
    }

    public void strike(Character character) {

        double strikeValue = this.strikePoint + 2 * d6;
        if ((this.strikePoint + 2 * d6) > character.defendPoint) {
            this.healthPoint -= (strikeValue - character.defendPoint);
        }
        // On a strike a strike value (SV) is calculated from SP and a d6 doubled.
        //  The strike is successful if 2 * d6 + SP is higher than the other character's DP.
        // On a successful strike the other character's HP is decreased by the SV - the other character's DP.
    }


}
