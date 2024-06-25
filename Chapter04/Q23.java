package Chapter04;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the employees name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = payRate * hours;
        double federalWithholding = federalTax * grossPay;
        double stateWithholding = stateTax * grossPay;

        System.out.println(" Employee name: " + name + "\n Hours worked: " + hours +
                "\n Pay rate: $" + payRate + "\n Gross Pay: $" + grossPay +
                "\n Deductions: \n Federal Withholding (%" + federalTax * 100 + "): $" + federalWithholding +
                "\n State Withholding (%" + stateTax * 100 + "): $" + stateWithholding +
                "\n Total Deduction: $" + stateWithholding + federalWithholding  +
                "\n Net Pay: $" + (grossPay - stateWithholding - federalWithholding));
    }
}
