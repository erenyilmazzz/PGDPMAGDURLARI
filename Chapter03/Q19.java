package Chapter03;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three edges of a triangle: ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        if (!(x1 + x2 > x3 && x1 + x3 > x2 && x2 + x3 > x1)) {
            System.out.println("The input is incorrect");
        }else {
            System.out.println("The triangle has a perimeter of " + (x1 + x2 + x3));
        }
    }
}
