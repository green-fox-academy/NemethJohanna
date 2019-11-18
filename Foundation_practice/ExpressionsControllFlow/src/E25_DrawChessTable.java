public class E25_DrawChessTable {
    // Crate a program that draws a chess table like this
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %

    public static void main(String[] args) {

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <= 8; j += 2) {
                if (j % 2 == 0) {
                    System.out.print("% ");
                } else {
                    System.out.println();
                }
            }
            System.out.println();
        }



    }
}