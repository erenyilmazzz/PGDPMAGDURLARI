package Chapter03;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exchange rate from $ to ¥: ");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Enter 0 to convert $ to ¥ and 1 to convert ¥ to $: ");
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("Enter the $ amount to convert: ");
            double amount = scanner.nextDouble();
            System.out.println("$" + amount + " is " + (amount * exchangeRate) + "¥");
        } else if (num == 1) {
            System.out.println("Enter the ¥ amount to convert: ");
            double amount = scanner.nextDouble();
            System.out.println( + amount + "¥ is $" + (amount / exchangeRate));
        } else {
            System.out.println("You have entered a wrong number, please start again.");
        }
    }
}
