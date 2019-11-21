public class R05_Bunnies {
    public static void main(String[] args) {
        //We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

        int bunnies = 3;
        System.out.println(bunnyEar(bunnies) - 1);
    }

    public static int bunnyEar (int n){
        if (n == 0){
            return 1;
        }
        return 2 + bunnyEar(n - 1);
    }

}
