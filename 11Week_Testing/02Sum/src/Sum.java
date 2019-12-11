public class Sum {

    public int sumOfElements (int [] numbers){
        if (numbers == null || numbers.length == 0){
            System.err.println("error list");
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
