package Chapter02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();
        System.out.print("Enter the gratuity rate: ");
        double gratuityRate = scanner.nextDouble() / 100;
        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
