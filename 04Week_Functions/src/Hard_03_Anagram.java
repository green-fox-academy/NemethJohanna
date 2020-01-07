public class Hard_03_Anagram {

    public static void main(String[] args) {

        String word = "dog";
        String word2 = "god";

        System.out.println(isAnagram(word, word2));

    }
    public static boolean isAnagram (String word, String word2){
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word.charAt(i) == word2.charAt(word2.length() - (i + 1))){
                    return true;
                }
            }
        }
        return false;
    }
}
