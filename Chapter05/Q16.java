package Chapter05;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int i = 1;

        System.out.println("The divisors of " + number + " are: ");
        while (number != 1) {
            i++;
            if (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
                i = 1;
            }
        }
    }
}
