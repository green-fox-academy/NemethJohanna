import java.awt.*;

public class Grid extends DrawImage {

    DrawImage floor = new DrawImage("img/floor.png");
    DrawImage wall = new DrawImage("img/wall.png");
    DrawImage[][] grid = new DrawImage[12][12];

    public Grid(){
        super();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = floor;
                grid[0][j] = wall;
                grid[i][0] = wall;
                grid[grid.length - 1][j] = wall;
                grid[i][grid.length - 1] = wall;
                grid[1][5] = wall;
                grid[2][3] = wall;
                grid[2][5] = wall;
                grid[2][6] = wall;
                grid[2][7] = wall;
                grid[2][9] = wall;
                grid[3][3] = wall;
                grid[3][5] = wall;
                grid[3][9] = wall;
                grid[4][1] = wall;
                grid[4][2] = wall;
                grid[4][3] = wall;
                grid[4][5] = wall;
                grid[4][6] = wall;
                grid[4][9] = wall;
                grid[4][10] = wall;
                grid[6][2] = wall;
                grid[6][3] = wall;
                grid[6][4] = wall;
                grid[6][5] = wall;
                grid[6][7] = wall;
                grid[6][8] = wall;
                grid[6][10] = wall;
                grid[7][5] = wall;
                grid[7][7] = wall;
                grid[7][8] = wall;
                grid[7][10] = wall;
                grid[8][2] = wall;
                grid[8][3] = wall;
                grid[8][5] = wall;
                grid[9][2] = wall;
                grid[9][3] = wall;
                grid[9][5] = wall;
                grid[9][7] = wall;
                grid[9][8] = wall;
                grid[9][9] = wall;
            }
        }
    }

    public void draw(Graphics graphics) {
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid.length - 1; j++) {
                grid[i][j].draw(graphics, (i) * 72, (j) * 72);
            }
        }
    }
}
