public class Fibonacci {

    public int fibonacciFunction(int n) throws FibonacciException {
        if ((n == 0) || (n == 1) || (n < 0)) {
            return n;
        } else if (n >= Integer.MAX_VALUE){
            throw new FibonacciException("Error");
        } else {
            return fibonacciFunction(n - 1) + fibonacciFunction(n - 2);
        }
    }
}