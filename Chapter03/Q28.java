package Chapter03;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 y1 w1 h1 of one rectangle and x2 y2 w2 h2 of the other rectangle: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();
        double left1 = x1 - (w1 / 2);
        double top1 = y1 + (h1 / 2);
        double right1 = x1 + (w1 / 2);
        double bottom1 = y1 - (h1 / 2);
        double left2 = x2 - (w2 / 2);
        double top2 = y2 + (h2 / 2);
        double right2 = x2 + (w2 / 2);
        double bottom2 = y2 - (h2 / 2);
        boolean isInside = (left1 <= left2 && right2 <= right1 && top1 >= top2 && bottom2 >= bottom1);
        boolean noOverlap = ((left1 >= right2 || left2 >= right1) || (top1 <= bottom2 || bottom2 >= top1));
        boolean overlaps = (((left2 > left1 && left2 < right1) || (right2 < right1 && right2 > left1)) && ((top2 < top1 && top2 > bottom1) || (bottom2 > bottom1 && bottom2 < top2)));
        boolean overlaps2 = left2 < right1 && right2 > left1 && top2 > bottom1 && bottom2 < top1;
        System.out.println("r2 " + (isInside ? "is inside " : (!noOverlap ? "overlaps " : "")) + (noOverlap ? "does not overlap " : "") + "r1");
    }
}
