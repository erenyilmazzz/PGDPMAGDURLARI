package Chapter03;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the weight of the package in pounds: ");
        double weight = scanner.nextDouble();
        if (weight <= 1){
            System.out.println("The cost of shipment is $3,5");
        } else if (weight <= 3) {
            System.out.println("The cost of shipment is $5,5");
        }else if (weight <= 10){
            System.out.println("The cost of shipment is $8,5");
        } else if (weight <= 20){
            System.out.println("The cost of shipment is $10,5");
        } else if (weight > 50){
            System.out.println("Sorry this package cannot be shipped");
        }
    }
}
