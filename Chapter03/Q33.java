package Chapter03;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight and price of the first package: ");
        double weight1 = scanner.nextDouble();
        double price1 = scanner.nextDouble();
        System.out.println("Enter the weight and price of the second package: ");
        double weight2 = scanner.nextDouble();
        double price2 = scanner.nextDouble();
        boolean is1Cheaper = (weight1 * price2 / weight2) > price1;
        boolean isEqual = (weight1 * price2 / weight2) == price1;
        System.out.println("Package 1 " + (isEqual ? "has the same price with " : (is1Cheaper ? "is cheaper than " : "is more expensive than ")) + "package 2");
    }
}
