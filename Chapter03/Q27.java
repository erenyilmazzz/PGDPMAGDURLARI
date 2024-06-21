package Chapter03;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 and y1 of your point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if ((200 - x) < (y * 2) || x < 0 || y < 0) {
            System.out.println("The point is not in the triangle");
        } else {
            System.out.println("The point is in the triangle");
        }
    }
}
