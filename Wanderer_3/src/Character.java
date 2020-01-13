public class Character extends PositionedImage {

    int maxHealthPoint;
    int healthPoint;
    int defendPoint;
    int strikePoint;
    int level;
    int d6 = (int)(Math.random() * 7);

    public Character(String filename) {
        super(filename);
    }

    public Character() {
        super();
    }

}
