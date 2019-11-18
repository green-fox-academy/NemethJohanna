public class E08_Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        //System.out.println(a);
        //System.out.println(b);

        int swap;
        swap = b;
        b = a;
        a = swap;

        System.out.println(a);
        System.out.println(b);

    }
}
