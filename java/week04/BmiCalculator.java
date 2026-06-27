import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height m: ");
        double height = scanner.nextDouble();

        double bmi = calculateBmi(weight, height);

        System.out.println("BMI = " + bmi);

        scanner.close();
    }

    public static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
}