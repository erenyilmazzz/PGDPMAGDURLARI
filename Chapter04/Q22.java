package Chapter04;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an two strings: ");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        if (str1.contains(str2)) {
            System.out.println(str2 + " is a substring of " + str1);
        } else {
            System.out.println(str2 + " is not a substring of " + str1);
        }
    }
}
