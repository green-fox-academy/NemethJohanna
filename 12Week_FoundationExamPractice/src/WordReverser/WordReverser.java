package WordReverser;

import java.util.ArrayList;
import java.util.Arrays;

public class WordReverser {
    public static void main(String[] args) {
        String sentenceToReverse = "lleW ,enod taht saw ton taht drah";
        reverseSentence(sentenceToReverse);
    }

    private static void reverseSentence(String sentenceToReverse) {
        String[] split = sentenceToReverse.split(" ");
        ArrayList stringList = new ArrayList();
        stringList.add(split);
        reverseWord(split.toString());

        //System.out.println(Arrays.toString(split));
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split.toString());
//        }

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

    }

    private static void reverseWord(String wordToReverse){
        char [] reverse = wordToReverse.toCharArray();
        for (int i = wordToReverse.length() - 1; i >= 0 ; i--) {
            System.out.print(reverse[i]);
        }
    }
}
