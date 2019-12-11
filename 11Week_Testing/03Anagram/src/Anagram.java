public class Anagram {

    public boolean isAnagram() {

        String input1 = "madam";
        String input2 = "madam";

        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[chars2.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
