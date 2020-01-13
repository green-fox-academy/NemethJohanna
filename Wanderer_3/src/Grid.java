import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Grid {

    PositionedImage floor = new PositionedImage("img/floor.png");
    PositionedImage wall = new PositionedImage("img/wall.png");
    PositionedImage[][] grid = new PositionedImage[12][12];

    public Grid() {

        String filePath = "assets/grid.txt";
        Path filename = Paths.get(filePath);

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filename);
        } catch (IOException e) {
            e.getStackTrace();
        }

        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < lines.size(); j++) {
                if (lines.get(i).charAt(j) == 'X'){
                    grid[i][j] = wall;
                } else {
                    grid[i][j] = floor;
                }
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
