public class F00_DivideByZero {

    public static void main (String[] args ) {

        int numberToDivide = 0;
        divideWithTen(numberToDivide);

    }

    private static void divideWithTen(int numberToDivide) {

        try {
            System.out.println(numberToDivide /= 10);
        } catch (ArithmeticException zero){
            System.out.println("fail");
        }

    }
}
