import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Body mass index is: ");
        System.out.println(massInKg / (heightInM*heightInM));

        // Print the Body mass index (BMI) based on these values
    }
}