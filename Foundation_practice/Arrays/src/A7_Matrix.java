import java.lang.reflect.Array;

public class A7_Matrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];

        for (int row = 0; row <= 3; row++) {
            for (int column = 0; column < matrix[3].length; column++) {
                if (row == column) {
                    matrix[row][column] = 1;
                }
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
