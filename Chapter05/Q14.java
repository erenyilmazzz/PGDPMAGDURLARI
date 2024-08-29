package Chapter05;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter two positive integers:" );
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b < a){
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("The gcd of " + a + " and " + b + " is " + i);
                break;
            }
        }
    }
}
