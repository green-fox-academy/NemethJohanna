import java.awt.image.BufferedImage;

public class Skeleton extends Character {

    BufferedImage drawImage;
    Character skeleton = new Character("img/skeleton.png");

    public Skeleton(Grid grid) {
        super();
        drawImage = skeleton.image;
        this.healthPoint = 4 * level * d6;
        this.defendPoint = 2 * d6;
        this.strikePoint = level * d6;
        this.isAlive = true;
        while ((grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] == grid.wall) || (grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] != (grid.grid[1][1]))) {
            this.xRandomCoordinate = (int) (Math.random() * 11) * 72;
            this.yRandomCoordinate = (int) (Math.random() * 11) * 72;
        }
    }

    public String status (){
        return "Skeleton  (Level " + this.level + ") HP: " + this.healthPoint + " | DP: " + this.defendPoint + " | SP: " + this.strikePoint + "\n";
    }

}
