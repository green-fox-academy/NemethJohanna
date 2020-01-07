import java.util.ArrayList;

public class Hard_05_PalindromeSearcher {

    public static void main(String[] args) {
        String arePalindromes = "racecar";
        findPalindromes(arePalindromes);
    }

    public static void findPalindromes(String arePalindromes){
        ArrayList<String> palindromes = new ArrayList<>();
        for (int i = 0; i < arePalindromes.length(); i++) {
            String[] chars = arePalindromes.split("");
            for (int j = chars.length / 2; j < chars.length; j++) {
                if (chars[j - 1].equals(chars[j + 1])){
                    //throws indexOutOfException aarrggg
                    palindromes.add(chars[j]);
                }
            }
        }
        System.out.println(palindromes);
    }
}
