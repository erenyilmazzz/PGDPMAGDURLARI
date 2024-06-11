package Chapter02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();
        double area = ((3.0 * Math.sqrt(3)) / 2.0) * (side * side);
        System.out.println("The area of the hexagon is " + area);
    }
}
