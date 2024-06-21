package Chapter03;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x and y coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance <= 10) {
            System.out.println("point " + x + " " + y + " is in the circle");
        } else {
            System.out.println("point " + x + " " + y + " is not in the circle");
        }
    }
}
