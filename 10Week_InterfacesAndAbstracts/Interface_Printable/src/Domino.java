public class Domino implements Printable{

    private int aSide;
    private int bSide;

    public int getaSide() {
        return 2;
    }

    public int getbSide() {
        return 3;
    }

    @Override
    public void printAllFields() {
        System.out.printf("Domino A side: %d, B side: %d", getaSide(), getbSide());
    }
}
