public class R01_NumberAdded {
    public static void main(String[] args) {
        //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        // 10 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;

        int result = add(10);
        System.out.println(result);
    }

    public static int add (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + add(n - 1);
        }
    }


}
