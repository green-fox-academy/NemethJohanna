//import java.util.ArrayList;
//import java.util.List;
//
//public class Hard02_Unique {
//    //  Create a function that takes a list of numbers as a parameter
//    //  Returns a list of numbers where every number in the list occurs only once
//
//    //  Example
//    //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//    //  should print: `[1, 11, 34, 52, 61]`
//
//    public static void main(String[] args) {
//        int intArray[] = {1, 11, 34, 11, 52, 61, 1, 34};
//        System.out.println(unique(intArray));
//    }
//
//    public static int[] unique(int [] intArray[]) {
//        int[] newList = new int[]{};
//        for (int i = 0; i < arr.length; i++) {      // végig megy a listán egyesével
//            if (arr[i] == newList[i]) {
//                newList[i];                          // ha a lista eleme még nem létezik, akkor adja a listához
//                break;
//            }                                       // ha már létezik, akkor hagyja ki.
//
//        }
//        return newList;
//    }
//}