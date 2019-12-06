public class Main {
    public static void main(String[] args) {

        Gnirts g = new Gnirts("example");
        System.out.println("Letter: " + g.charAt(5));
        System.out.println("Tha string's length is: " + g.length() + " character.");
        System.out.println(g.subSequence(1, 3));

        Shifter s = new Shifter("example", 2);
        System.out.println("Letter: " + s.charAt(2));
        System.out.println("Tha string's length is: " + s.length() + " character.");

    }
}
