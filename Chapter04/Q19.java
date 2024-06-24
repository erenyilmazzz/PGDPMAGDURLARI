package Chapter04;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN integer number: ");
        String output = scanner.nextLine();
        int num = Integer.parseInt(output);
            int d9 = num % 10;
            num /= 10;
            int d8 = num % 10;
            num /= 10;
            int d7 = num % 10;
            num /= 10;
            int d6 = num % 10;
            num /= 10;
            int d5 = num % 10;
            num /= 10;
            int d4 = num % 10;
            num /= 10;
            int d3 = num % 10;
            num /= 10;
            int d2 = num % 10;
            num /= 10;
            int d1 = num;

        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                   d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("The ISBN-10 number is " + output + (d10 < 10 ? d10 : "X"));
    }
}
