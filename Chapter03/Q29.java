package Chapter03;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle 1's x1 and y1 of the center and radius: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();
        System.out.println("Enter circle 2's x2 and y2 of the center and radius: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        boolean isInsideCircle = (distance + radius2) <= radius1;
        boolean overlaps = distance - radius2 <= radius1;
        System.out.println("Circle 2 " + (isInsideCircle ? "is inside " : overlaps ? "overlaps " : "does not overlap " ) + "circle 1");
    }
}
