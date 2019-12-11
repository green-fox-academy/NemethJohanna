public class Anagram {

    public boolean isAnagram(String word1, String word2) {

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[chars2.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
