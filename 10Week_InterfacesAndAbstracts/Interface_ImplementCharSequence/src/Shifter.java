public class Shifter implements CharSequence {

    private String stringToShift;
    private int howManyToShift;

    public Shifter(String stringToShift, int howManyToShift) {
        this.stringToShift = stringToShift;
        this.howManyToShift = howManyToShift;

    }

    @Override
    public int length() {
        return stringToShift.toCharArray().length;
    }

    @Override
    public char charAt(int index) {
        stringToShift.charAt(index);


        return 0;
    }

    @Override
    public char subSequence(int start, int end) {
        return 0;
    }
}
