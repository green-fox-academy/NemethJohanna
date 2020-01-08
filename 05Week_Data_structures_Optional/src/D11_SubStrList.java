import java.util.List;

public class D11_SubStrList {
    public static void main(String[] args) {

        String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};

        System.out.println(subStrList("ching", searchArr));
        //  should print: `4`
        System.out.println(subStrList("not", searchArr));
        //  should print: `-1`
    }

    public static int subStrList(String stringToFind, String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(stringToFind)) {
                return i;
            }
        }
        return -1;
    }

}
