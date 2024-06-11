package Chapter02;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        double sqrt = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double distance = Math.pow(sqrt,0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}
