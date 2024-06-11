package Chapter02;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
                 int amount =(int) (scanner.nextDouble() * 100);
                 int remainingAmount = amount * 100;
                 int numberOfOneDollars = remainingAmount / 10000;
                 remainingAmount = remainingAmount % 10000;
                 int numberOfQuarters = remainingAmount / 2500;
                 remainingAmount = remainingAmount % 2500;
                 int numberOfDimes = remainingAmount / 1000;
                 remainingAmount = remainingAmount % 1000;
                 int numberOfNickels = remainingAmount / 500;
                 remainingAmount = remainingAmount % 500;
                 int numberOfPennies = remainingAmount / 100;
        System.out.println("Your ammount " + amount + " consists of");
        System.out.println("   " + numberOfOneDollars + " dollars");
        System.out.println("   " + numberOfQuarters + " quarters");
        System.out.println("   " + numberOfDimes + " dimes");
        System.out.println("   " + numberOfNickels + " nickels");
        System.out.println("   " + numberOfPennies + " pennies");
    }
}
