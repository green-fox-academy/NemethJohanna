public class Hard04_PalindromeBuilder {
    /*# Palindrome builder

## What the hell is a palindrome?

> A palindrome is a word, phrase, number, or other sequence of characters which
> reads the same backward as forward, such as madam or racecar. *\[for more
> detail check [palindrome](https://en.wikipedia.org/wiki/Palindrome) on
> Wikipedia]*

### Exercise

Create a function named **create palindrome** following your current language's
style guide. It should take a string, create a palindrome from it and then
return it.

### Examples

|    input   |       output       |
| :--------: | :----------------: |
|     ""     |         ""         |
| "greenfox" | "greenfoxxofneerg" |
|    "123"   |      "123321"      |*/

    public static void main(String[] args) {
        String input = "greenfox";
        System.out.println(palindromeBuilder(input));
    }
    public static String palindromeBuilder (String input){
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            input += chars[chars.length - 1 - i];
        }
        
        return input;
    }

}
