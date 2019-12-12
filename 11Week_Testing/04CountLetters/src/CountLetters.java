import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> letterCount (String wordToCount){
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
        return charCountMap;
    }

}
