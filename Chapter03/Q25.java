package Chapter03;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();
        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        double intersectX = ((e * d) - (b * f)) / (a * d - b * c);
        double intersectY = (a * f - e * c) / (a * d - b * c);
        if (Double.isInfinite(intersectX) || Double.isInfinite(intersectY)) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at (" + intersectX + ", " + intersectY + ")");
        }
    }
}
//cramers rule
//(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
//ax+by=e cx + dy = f
// x = ed - bf / ad - bc y = af - ec / ad - bc