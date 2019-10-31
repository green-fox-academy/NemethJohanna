public class ToDoPrint {
    public static void main(String... args)
    {
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String beginning = "My todo:\n";
        String number2 = " - Download games\n";
        String number3 = "\t- Diablo";

        System.out.println(beginning.concat(todoText) + number2 + number3);
    }
}
