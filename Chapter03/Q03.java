package Chapter03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e and f one by one: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        if (a * d - b * c == 0){
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
//cramers rule
//(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
//ax+by=e cx + dy = f
// x = ed - bf / ad - bc y = af - ec / ad - bc
//Write a program that solves the following equation and displays the value for x and y : 3.4x + 50.2y = 44.5
//2.1x + .55y = 5.9