package Chapter03;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Is the number divisible by 5 and 6? " + (number % 5 == 0 && number % 6 == 0));
        System.out.println("Is the number divisible by 5 or 6? " + (number % 5 == 0 || number % 6 == 0));
        System.out.println("Is the number divisible by 5 or 6, but not both? " + (number % 5 == 0 ^ number % 6 == 0));
    }
}
