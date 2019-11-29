public class TextFromMatrix {
    public static void main(String[] args) {
        String [][] matrix;
        matrix = new String[][]{{"h", "t", "e"}, {"k", "l", "p"}, {"l", "b", "o"}};

        System.out.println(createText(matrix));

    }

    public static String createText (String[][] input){
        String text = "";                                   // StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0){
                    text += input[i][j];                    // builder.append(matrix[i][j];
                } else if (i % 2 == 1 && j % 2 == 1){       // else if (i % 2 != 0 && j % 2 != 0)
                    text += input[i][j];                    // builder.append(matrix[i][j];
                }
            }
        }
        return text;                                        // return builder.toString();
    }
}
