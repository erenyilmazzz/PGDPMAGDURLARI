package Chapter02;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("Enter acceleration: ");
        double acceleration = scanner.nextDouble();
        double minRunway = (speed * speed) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + minRunway);
    }
}
