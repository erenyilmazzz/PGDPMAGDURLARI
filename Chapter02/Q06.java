package Chapter02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        int total = 0;
        if ((number / 10) == 0){
            System.out.println("The sum of the digits is " + number);
        } else if ((number / 10) < 10){
            total += number % 10;
            number /= 10;
            total += number % 10;
        } else {
            total += number % 10;
            number /= 10;
            total += number % 10;
            number /= 10;
            total += number % 10;
        }
        System.out.println("The sum of the digits is " + total);
    }
}
