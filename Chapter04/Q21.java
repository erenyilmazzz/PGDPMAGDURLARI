package Chapter04;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String ssn = input.nextLine();

        if (ssn.length() == 11) {
            if (ssn.charAt(0) <= '9' && ssn.charAt(0) >= '0' &&
                    ssn.charAt(1) <= '9' && ssn.charAt(1) >= '0' &&
                    ssn.charAt(2) <= '9' && ssn.charAt(2) >= '0' &&
                    ssn.charAt(4) <= '9' && ssn.charAt(4) >= '0' &&
                    ssn.charAt(5) <= '9' && ssn.charAt(5) >= '0' &&
                    ssn.charAt(7) <= '9' && ssn.charAt(7) >= '0' &&
                    ssn.charAt(8) <= '9' && ssn.charAt(8) >= '0' &&
                    ssn.charAt(9) <= '9' && ssn.charAt(9) >= '0' &&
                    ssn.charAt(10) <= '9' && ssn.charAt(10) >= '0' &&
                    ssn.charAt(3) == '-' && ssn.charAt(6) == '-'
            ) {
                System.out.println(ssn + " is a valid SSN");
            } else {
                System.out.println(ssn + " is not a valid SSN");
            }
        } else {
            System.out.println(ssn + " is not a valid SSN");
        }
    }
}
