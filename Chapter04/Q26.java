package Chapter04;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an dollars in double, for example 11.56: ");
        String ammountStr = scanner.nextLine();
        double amountDouble = Double.parseDouble(ammountStr) * 100;
        int dot = ammountStr.indexOf('.');
        //burada gpt den yardım almam gerekti
        int dollars = dot == -1 ? Integer.parseInt(ammountStr) : Integer.parseInt(ammountStr.substring(0, dot));
        int cents = dot == -1 ? 0 : Integer.parseInt(ammountStr.substring(dot+1, dot+3));
        int remainingAmount = cents;
        int numberOfOneDollars = dollars;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        System.out.println("Your ammount " + ammountStr + " consists of");
        System.out.println("   " + numberOfOneDollars + " dollars");
        System.out.println("   " + numberOfQuarters + " quarters");
        System.out.println("   " + numberOfDimes + " dimes");
        System.out.println("   " + numberOfNickels + " nickels");
        System.out.println("   " + numberOfPennies + " pennies");
    }
}
