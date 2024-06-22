package Chapter04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a pentagon from the center to a vertex: ");
        double length = scanner.nextDouble();
        double side = 2 * length * Math.sin((Math.PI / 5));
        double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
        System.out.println("The area of the pentagon is " + area);
    }
}
