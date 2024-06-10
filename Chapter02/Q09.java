package Chapter02;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter v0: ");
        double v0 = scanner.nextDouble();
        System.out.print("Enter v1: ");
        double v1 = scanner.nextDouble();
        System.out.print("Enter the time span: ");
        double seconds = scanner.nextDouble();
        double avg = (v1 - v0) / seconds;
        System.out.println("The average acceleration is " + avg);
    }
}
