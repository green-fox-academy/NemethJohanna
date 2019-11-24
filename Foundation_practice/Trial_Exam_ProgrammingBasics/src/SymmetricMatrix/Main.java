package SymmetricMatrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*Create a function named isSymmetric that takes an n×n integer matrix (two dimensional array/list) as a parameter and returns true
if the matrix is symmetric or false if it is not.

Symmetric means it has identical values along its diagonal axis from top-left to bottom-right, as in the first example.

Example 1:                               Example 2:
 [                                        [
  [1, 0, 1],                              [7, 7, 7],
  [0, 2, 2],                              [6, 5, 7],
  [1, 2, 5]                               [1, 2, 1]
 ]                                        ]
 Output: true                           Output: false
*/
        int size = 4;
        Integer[][] matrix;
        matrix = new Integer[][]{
                {1, 0, 1, 2},
                {0, 3, 4, 5},
                {1, 4, 6, 7},
                {2, 5, 7, 8},
        };
        System.out.println(isSymmetric(matrix));
    }

    public static boolean isSymmetric (Integer[][] matrix){
        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == (matrix[j][i])){        //mindig true az eredmény itt lehet a hiba
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}
