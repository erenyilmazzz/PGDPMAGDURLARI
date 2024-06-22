package Chapter04;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(scanner.nextDouble());
        double y1 = Math.toRadians(scanner.nextDouble());
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(scanner.nextDouble());
        double y2 = Math.toRadians(scanner.nextDouble());

        double radius = 6371.01;
        double d = radius * Math.acos((Math.sin(x1) * Math.sin(x2)) +
                (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        System.out.println("The distance between the two points is " + d);
    }
}
