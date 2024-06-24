package Chapter04;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a letter: ");
        char ch = scanner.next().charAt(0);
        String letter = Character.toString(ch).toLowerCase();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                letter.equals("o") || letter.equals("u")) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a constant");
        }
    }
}
