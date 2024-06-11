package Chapter02;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();
        double BMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254)); //burada daha işlemedik diye Math.pow kullanmıyorum
        System.out.println("BMI is " + BMI);
    }
}