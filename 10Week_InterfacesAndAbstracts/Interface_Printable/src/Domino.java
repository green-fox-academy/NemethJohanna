public class Domino implements Printable{

    private int aSide;
    private int bSide;

    public Domino(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public int getaSide() {
        return 0;
    }

    public int getbSide(){
        return 0;
    }

    @Override
    public void printAllFields() {
        System.out.printf("Domino A side: %d, B side: %d\n", getaSide(), getbSide());
    }
}
