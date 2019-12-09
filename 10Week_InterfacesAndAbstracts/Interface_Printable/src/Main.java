public class Main {
    public static void main(String[] args) {

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (Todo t : todos) {
            t.printAllFields();
        }
    }
}
