package Chapter03;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point p0(x0,y0): ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        System.out.println("Enter point p1(x1,y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter point p2(x2,y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double side = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        boolean onLine = side == 0 && x2 <= x1 && y2 <= y1 && x2 >= x0 && y2 >= y0;
        System.out.println("The point (" + x2 + "," + y2 + ") is " + (onLine ? "" : "not ") + "on the line segment from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");

    }
}
