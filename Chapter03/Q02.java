package Chapter03;

import java.util.Random;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is " + a + " + " + b + " + " + c + "?");
        int answer = scanner.nextInt();
        System.out.println(a + " + " + b + " + " + c + " = " + answer + " is " + (a + b + c == answer));
    }
}
