import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Optional02_TicTacToe2 {

    public static void main(String[] args) {
        System.out.println(ticTacResult("win-o.txt"));
        System.out.println(ticTacResult("win-x.txt"));
        System.out.println(ticTacResult("draw.txt"));
    }

    public static String ticTacResult(String filename){
        Path filePath = Paths.get(filename);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e){
            e.getStackTrace();
        }

        String [][] matrix = new String[lines.size()][];

        for (int i = 0; i < lines.size(); i++) {
            matrix[i] = lines.get(i).split("");
        }

        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[0][j].equals(matrix[1][j]) && matrix[1][j].equals(matrix[2][j])) {
                    result = matrix[0][j];
                    break;
                } else if (matrix[i][0].equals(matrix[i][1]) && matrix[i][1].equals(matrix[i][2])) {
                    result = matrix[i][0];
                    break;
                } else if (matrix[2][j].equals(matrix[1][j]) && matrix[1][j].equals(matrix[0][j])) {
                    result = matrix[2][j];
                    break;
                } else if (matrix[0][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][2])) {
                    result = matrix[0][0];
                } else
                    result = "Draw";
            }
        }
        return result;

    }
}
