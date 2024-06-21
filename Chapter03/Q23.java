package Chapter03;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (x > 5 || y > 2.5 || x < -5 || y < -2.5) {
            System.out.println("The point is out of the rectangle");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is in the rectangle");
        }
    }
}
