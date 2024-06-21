package Chapter03;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        System.out.println("What is the addition of " + num1 + " and " + num2 + "?");
        int answer = scanner.nextInt();
        System.out.println((answer == num1 + num2) ? "Your answer is correct!" : "Your answer is wrong. " + num1 + " + " + num2 + " should be " + (num2 + num1));
    }
}
