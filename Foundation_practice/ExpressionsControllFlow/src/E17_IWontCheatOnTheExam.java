public class E17_IWontCheatOnTheExam {
    public static void main (String[] args) {

        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"

        String cheat = ". I won't cheat on the exam!";

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + cheat);
        }
    }
}
