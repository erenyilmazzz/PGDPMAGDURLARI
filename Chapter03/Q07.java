package Chapter03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount in double (for example 11,56): ");
        double amount = scanner.nextDouble();
        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;
        int numberOfPennies = remainingAmount;
        String dollars = switch (numberOfOneDollars){
            case 0 -> "";
            case 1 -> " dollar ";
            default -> " dollars ";
        };
        String quarters = switch (numberOfQuarters){
            case 0 -> "";
            case 1 -> " quarter ";
            default -> " quarters ";
        };
        String dimes = switch (numberOfDimes){
            case 0 -> "";
            case 1 -> " dime ";
            default -> " dimes";
        };
        String nickels = switch (numberOfNickels){
            case 0 -> "";
            case 1 -> " nickel ";
            default -> " nickels ";
        };
        String pennies = switch (numberOfPennies){
            case 0 -> "";
            case 1 -> " penny ";
            default -> " pennies ";
        };
        System.out.println("Your amount " + amount + " consists of " + (numberOfOneDollars > 0 ? numberOfOneDollars : "")
        + dollars + (numberOfQuarters > 0 ? numberOfQuarters : "") + quarters + (numberOfDimes > 0 ? numberOfDimes : "")+ dimes +
                (numberOfNickels > 0 ? numberOfNickels : "") + nickels
        + (numberOfPennies > 0 ? numberOfPennies : "") + pennies);
    }
}
