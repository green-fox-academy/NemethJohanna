public class H01_BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        //mass/height^2

        // Print the Body mass index (BMI) based on these values

        System.out.println("The body mass is: " + massInKg / (heightInM * heightInM));

    }
}
