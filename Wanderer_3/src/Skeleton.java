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
        while ((grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] == grid.wall) || (grid.grid[xRandomCoordinate / 72][yRandomCoordinate / 72] != (grid.grid[1][1]))) {
            this.xRandomCoordinate = (int) (Math.random() * 11) * 72;
            this.yRandomCoordinate = (int) (Math.random() * 11) * 72;
        }
    }

}
