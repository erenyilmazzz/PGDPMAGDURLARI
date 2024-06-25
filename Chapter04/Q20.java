package Chapter04;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter anything: ");
        String s = scanner.nextLine();
        int length = s.length();
        char ch = s.charAt(0);

        System.out.println("Your input has " + length + " characters and the first " +
                "character is " + ch);
    }
}
