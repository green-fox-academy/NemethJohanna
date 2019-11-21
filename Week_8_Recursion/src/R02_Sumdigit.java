public class R02_Sumdigit {
    public static void main(String[] args) {
        //Given a non-negative integer n, return the sum of its digits recursively (without loops). + számjegyeinek összege
        // int num = 321;
        // 3 + 2 + 1 = 6;

        int result = sumOfDigits(456);
        System.out.println(result);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
