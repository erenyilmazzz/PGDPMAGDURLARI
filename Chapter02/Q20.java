package Chapter02;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter interest rate (e.g., 3 for 3%): ");
        double annualInterestRate = scanner.nextDouble();
        double interest = balance *(annualInterestRate / 1200);
        System.out.println("The interest is " + interest);
    }
}
