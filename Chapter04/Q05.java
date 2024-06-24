package Chapter04;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = scanner.nextInt();
        System.out.println("Enter the length of the sides");
        double length = scanner.nextDouble();

        double area = sides * length * length / (4 * Math.tan(Math.PI / sides));
        System.out.println("The area of the polygon is " + area);
    }
}
