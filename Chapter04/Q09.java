package Chapter04;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int ch = character;
        System.out.println("The Unicode for the character " + character + " is " + ch);

    }
}
