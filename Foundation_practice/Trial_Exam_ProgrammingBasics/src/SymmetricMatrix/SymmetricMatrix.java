package SymmetricMatrix;

public class SymmetricMatrix {
    public static void main(String[] args) {

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


    public static boolean isSymmetric (Integer[][] matrix) {

        int isEqual = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == (matrix[j][i])) {
                    isEqual++;
                }
            }
        }

            if (isEqual == (matrix.length * matrix.length)) {
                return true;
            } else {
                return false;
            }

    }
}
