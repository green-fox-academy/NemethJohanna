import java.util.Scanner;

public class F04_Sum {
    public static void main(String[] args) {
        System.out.println(sum(12));
    }

    public static int sum(int number) {
        int output = 0;
        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (number < 0) {
            return 0;
        } else {
            for (int i = 0; i <= number; i++) {
            output += i;
        }
        return output;
    }
}
}
