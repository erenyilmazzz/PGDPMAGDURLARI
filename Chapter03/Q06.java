package Chapter03;

import java.util.Map;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter feet: ");
        int feet = scanner.nextInt();
        System.out.print("Enter inches: ");
        int inches = scanner.nextInt();
        double kilos = weight * 0.45359237;
        double meters = ((feet * 12) + inches) * 0.0254;
        double BMI = kilos / Math.pow(meters,2);
        System.out.println("BMI is " + BMI);
        if (BMI < 18){
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
