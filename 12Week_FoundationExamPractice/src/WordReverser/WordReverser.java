package WordReverser;

public class WordReverser {
    public static void main(String[] args) {
        String sentenceToReverse = "lleW ,enod taht saw ton taht drah";
        reverseSentence(sentenceToReverse);
    }

    private static void reverseSentence(String sentenceToReverse) {

        String[] words = sentenceToReverse.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
    }

}
