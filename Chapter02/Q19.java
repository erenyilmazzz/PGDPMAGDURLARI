package Chapter02;

import java.util.Scanner;

public class Q19 {
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
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();
        double sqrt = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double distance1 = Math.pow(sqrt,0.5);
        double sqrt1 = ((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        double distance2 = Math.pow(sqrt1,0.5);
        double sqrt2 = ((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double distance3 = Math.pow(sqrt2,0.5);
        double s = (distance1 + distance2 + distance3) / 2;
        double abc = s * (s - distance1) * (s - distance2) * (s - distance3);
        double area = Math.sqrt(abc);
        System.out.println("The area of the triangle is " + area);
    }
}
