public class Gnirts implements Char, CharSequence {

    private String string ;
    private String charSequence;

    public Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.toCharArray().length;
    }

    @Override
    public char charAt(int index) {
        if (index >= string.length()) {
            throw new IndexOutOfBoundsException();
        } else {
            return string.charAt(string.length() - 1 - index);
        }
    }

    @Override
    public char subSequence(int start, int end) {
     return 0;
    }
}
