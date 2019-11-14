public class F01_Doubling {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
    public static void main (String[] args){
          int baseNum = 123;
          int doubled = doubling(baseNum);
          System.out.println(doubled);
    }

    public static int doubling (int baseNum){
          int output = baseNum * 2;
          return output;
    }


}
