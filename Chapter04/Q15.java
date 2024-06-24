package Chapter04;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        if (letter > 65 && letter <= 90) {
            letter += 32;
        }

        if (letter >= 97 && letter <= 122) {
            letter %= 96;
            int number = switch (letter) {
                case 1, 2, 3 -> 2;
                case 4, 5, 6 -> 3;
                case 7, 8, 9 -> 4;
                case 10, 11, 12 -> 5;
                case 13, 14, 15 -> 6;
                case 16, 17, 18, 19 -> 7;
                case 20, 21, 22 -> 8;
                case 23, 24, 25, 26 -> 9;
                default -> 0;
            };
            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
