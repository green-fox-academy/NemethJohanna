// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

// 0, sorban a 0. oszlopban legyen 1-es, amúgy 0 legyen!!!!
// első sorban az első oszlopban
// második sorban a második oszlopban
// hanyadik sor hanyadik eleme legyen 1
// ha megegyezik a sor és az oszlop, akkor legyen 1
// ha megegyezik a sor és oszlop, akkor adjon hozzá egyet a sorhoz és oszlophoz

import java.util.Arrays;

public class Matrix {
    private static int col;

    public static void main(String[] args) {
       int[][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col){
                    matrix [row][col] += 1;
                }
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }
        }

}