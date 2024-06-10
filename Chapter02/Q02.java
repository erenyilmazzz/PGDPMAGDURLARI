package Chapter02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder:");
        double radius = scanner.nextDouble();
        System.out.println("Enter the length of a cylinder:");
        double length = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("The area is " + area);
        double volume = area * length;
        System.out.println("The volume is " + volume);
    }
}
