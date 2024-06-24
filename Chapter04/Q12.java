package Chapter04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hex = scanner.nextLine();
        int decimal = 0;
        try{
            decimal = Integer.parseInt(hex, 16);
            int number = decimal / 8;
            decimal = decimal % 8;
            number *= 10;
            number += decimal / 4;
            decimal = decimal % 4;
            number *= 10;
            number += decimal / 2;
            decimal = decimal % 2;
            number *= 10;
            number += decimal;
            System.out.println("The binary is " + number);
        } catch (NumberFormatException nfe) {
            System.out.println(hex + " is an invalid hex digit");
        }
    }
}
