package Chapter03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three digit number: ");
        int input = scanner.nextInt();
        int number = input;
        int numReversed = 0;
        numReversed += number % 10;
        number /= 10;
        numReversed *=10;
        numReversed += number % 10;
        number /= 10;
        numReversed *= 10;
        numReversed += number;
        boolean isPalindrome = input == numReversed;
        System.out.println(input + " is " + (isPalindrome ? "" : "not ") + "a palindrome");
    }
}
