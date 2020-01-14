package MatrixRotate;

import java.util.Arrays;

public class MatrixRotate {
    public static void main(String[] args) {

      int [][] matrix = { {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}, };

        rotateMatrix(matrix);

    }

    public static void rotateMatrix(int[][] matrixToRotate){
        int[][] matrix = new int[matrixToRotate.length][matrixToRotate.length];
        for (int i = 0; i < matrixToRotate.length; i++) {
            for (int j = 0; j < matrixToRotate[i].length; j++) {
                matrix[i][(matrixToRotate.length - 1) - j] = matrixToRotate[j][i];
            }
            System.out.print(Arrays.toString(matrix[i]));
            System.out.println();
        }

    }

}