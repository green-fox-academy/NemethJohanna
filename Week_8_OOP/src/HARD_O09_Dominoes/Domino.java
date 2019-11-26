package HARD_O09_Dominoes;

public class Domino {
    private final int left;
    private final int right;

 //   ArrayList<Integer> dom = new ArrayList<>();

//    public List<Integer> put() {
//        for (int i = 0; i < 6; i++) {
//            dom.get(i);
//        }
//        return dom;
//    }

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }
}
