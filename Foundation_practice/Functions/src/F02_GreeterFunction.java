public class F02_GreeterFunction {

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
// - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`

    public static void main (String[] args) {

        String al = "Green Fox";
        System.out.println(greet(al));

    }

    public static String greet (String input){
        String greeting = "Greetings dear, " + input + "!";
        return greeting;

    }
}
