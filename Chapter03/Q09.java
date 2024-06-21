package Chapter03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN integer number: ");
        String output = scanner.nextLine();
        int num = Integer.parseInt(output);
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;
        int d6;
        int d7;
        int d8;
        int d9;
        if (output.startsWith("0")){
            d1 = 0;
            d9 = num % 10;
            num /= 10;
            d8 = num % 10;
            num /= 10;
            d7 = num % 10;
            num /= 10;
            d6 = num % 10;
            num /= 10;
            d5 = num % 10;
            num /= 10;
            d4 = num % 10;
            num /= 10;
            d3 = num % 10;
            num /= 10;
            d2 = num;
        } else if (output.startsWith("00")) {
            d1 = 0;
            d2 = 0;
            d9 = num % 10;
            num /= 10;
            d8 = num % 10;
            num /= 10;
            d7 = num % 10;
            num /= 10;
            d6 = num % 10;
            num /= 10;
            d5 = num % 10;
            num /= 10;
            d4 = num % 10;
            num /= 10;
            d3 = num;
        } else if (output.startsWith("000")) {
            d1 = 0;
            d2 = 0;
            d3 = 0;
            d9 = num % 10;
            num /= 10;
            d8 = num % 10;
            num /= 10;
            d7 = num % 10;
            num /= 10;
            d6 = num % 10;
            num /= 10;
            d5 = num % 10;
            num /= 10;
            d4 = num;
        } else {
            d9 = num % 10;
            num /= 10;
            d8 = num % 10;
            num /= 10;
            d7 = num % 10;
            num /= 10;
            d6 = num % 10;
            num /= 10;
            d5 = num % 10;
            num /= 10;
            d4 = num % 10;
            num /= 10;
            d3 = num % 10;
            num /= 10;
            d2 = num % 10;
            num /= 10;
            d1 = num;
        }
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("The ISBN-10 number is " + output + (d10 < 10 ? d10 : "X"));
    }
}
