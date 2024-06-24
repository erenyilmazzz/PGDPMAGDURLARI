package Chapter04;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double x1 = Math.cos(Math.toRadians(72)) * radius;
        double y1 = Math.sin(Math.toRadians(72)) * radius;
        double x2 = Math.cos(Math.toRadians(0)) * radius;
        double y2 = Math.sin(Math.toRadians(0)) * radius;
        double x3 = Math.cos(Math.toRadians(-72)) * radius;
        double y3 = Math.sin(Math.toRadians(-72)) * radius;
        double x4 = Math.cos(Math.toRadians(-144)) * radius;
        double y4 = Math.sin(Math.toRadians(-144)) * radius;
        double x5 = Math.cos(Math.toRadians(144)) * radius;
        double y5 = Math.sin(Math.toRadians(144)) * radius;
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
        System.out.println(x3);
        System.out.println(y3);
        System.out.println(x4);
        System.out.println(y4);
        System.out.println(x5);
        System.out.println(y5);
    }
}
