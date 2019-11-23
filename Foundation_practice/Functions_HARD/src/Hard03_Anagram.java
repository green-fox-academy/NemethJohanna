public class Hard03_Anagram {
//    # Anagram
//
//## What the hell is an anagram?
//            > An anagram is direct word switch or word play, the result of rearranging the
//> letters of a word or phrase to produce a new word or phrase, using all the
//> original letters exactly once; for example, the word anagram can be rearranged
//> into nag-a-ram. *\[for more detail check
//> [anagram](https://en.wikipedia.org/wiki/Anagram) on Wikipedia]*
//
//            ### Exercise
//
//    Create a function named **is anagram** following your current language's style
//    guide. It should take two strings and return a boolean value depending on
//    whether its an anagram or not.
//
//            ### Examples
//
//| input 1 | input 2 | output |
//            | :-----: | :-----: | :----: |
//            |  "dog"  |  "god"  |  true  |
//            | "green" |  "fox"  |  false |
    public static void main(String[] args) {
    String input1 = "lat";
    String input2 = "tal";
        System.out.println(isAnagram(input1, input2));
    }

    public static boolean isAnagram (String input1, String input2){
        boolean anagram = true;

        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[chars2.length - i - 1]){
                return false;
            }
        }
    return anagram;
    }

}
