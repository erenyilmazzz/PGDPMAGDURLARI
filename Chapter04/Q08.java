package Chapter04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int ascii = scanner.nextInt();

        char code = (char) ascii;
        System.out.println("The character for ASCII code " + ascii + " is " + code );
    }
}
