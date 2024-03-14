import java.util.*;

class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        // Classify BMI
        String cls;
        if (bmi < 18.5) {
            cls = "Underweight";
        } else if (bmi < 25) {
            cls = "Normal weight";
        } else if (bmi < 30) {
            cls = "Overweight";
        } else {
            cls = "Obese";
        }

        System.out.printf("Your BMI is %.2f, which is classified as %s.", bmi, cls);
    }
}
