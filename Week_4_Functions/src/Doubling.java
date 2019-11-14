// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

public class Doubling {
    public static void main(String[] args) {
        int baseNum = 123;

        int doubled = doubling(baseNum);
        System.out.println(doubled);

        System.out.println(doubling(34));
        System.out.println(doubling(5));
    }
    public static int doubling (int number) {
        int output = number * 2;
        return output;
    }

}
