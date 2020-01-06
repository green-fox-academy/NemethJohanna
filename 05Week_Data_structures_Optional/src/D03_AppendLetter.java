import java.util.*;

public class D03_AppendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));
    }
    public static List<String> appendA(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + "a"));
        }
    return list;
    }
}