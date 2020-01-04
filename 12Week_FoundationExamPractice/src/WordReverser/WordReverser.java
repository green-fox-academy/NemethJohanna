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
        //stringList.add(split);

        System.out.println(Arrays.toString(split));
        
    }

    private static void reverseWord(String wordToReverse){
        char [] reverse = wordToReverse.toCharArray();
        for (int i = wordToReverse.length() - 1; i >= 0 ; i--) {
            System.out.print(reverse[i]);
        }
    }
}
