package Chapter02;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        double numberOfYears = scanner.nextDouble();
        double futureInvestmentValue = investmentAmount * Math.pow((1 + (annualInterestRate / 1200)),numberOfYears * 12);
        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
