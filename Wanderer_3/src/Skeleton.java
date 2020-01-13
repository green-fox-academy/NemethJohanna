import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");
    int xRandomCoordinate;
    int yRandomCoordinate;
    boolean hasKey;

    public Skeleton(Grid grid) {
        super();
        drawImage = skeleton.image;
        this.healthPoint = 2 * level * d6;
        this.defendPoint = level / 2 * d6;
        this.strikePoint = level * d6;
        while ((grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] == grid.wall) || (grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] != (grid.grid[1][1]))) {
            this.xRandomCoordinate = (int) (Math.random() * 11) * 72;
            this.yRandomCoordinate = (int) (Math.random() * 11) * 72;
        }
    }

    public String status (){
        return "Skeleton (Level " + skeleton.level + ") HP: " + skeleton.healthPoint + "/" + skeleton.maxHealthPoint + " | DP: " + skeleton.defendPoint + " | SP: " + skeleton.strikePoint + "\n";
    }

}
