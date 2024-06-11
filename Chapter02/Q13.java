package Chapter02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double amount = scanner.nextDouble();
        double monthlyInterest = 1.00417;
        double endMoney = amount * monthlyInterest;
        endMoney = (amount + endMoney) * monthlyInterest;
        endMoney = (amount + endMoney) * monthlyInterest;
        endMoney = (amount + endMoney) * monthlyInterest;
        endMoney = (amount + endMoney) * monthlyInterest;
        endMoney = (amount + endMoney) * monthlyInterest;
        System.out.println("After the sixth month, the account value is " + endMoney);
    }
}
