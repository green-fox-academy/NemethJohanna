public class R04_GreatestCommonDiv {
    public static void main(String[] args) {
        //Find the greatest common divisor of two numbers using recursion.

    int a = 36; // 2, 3, 4, 6, 9,   18
    int b = 14; // 2, 3, 6, 9,      18
    int result = gComDiv(a, b);
        System.out.println(result);

    }

    public static int gComDiv (int a, int b) {
      if (b == 0) {
          return a;
      }
          return gComDiv(b, a % b);

    }

}
