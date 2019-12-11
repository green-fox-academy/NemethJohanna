import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public String letterCount (String wordToCount){
        char[] wordToCharacterList = wordToCount.toCharArray();

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char c : wordToCharacterList) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> letters : charCountMap.entrySet()) {
            System.out.printf("%s occurance %t times.\n"), charCountMap.get, charCountMap.getKey());
        }
        return;
    }

}
