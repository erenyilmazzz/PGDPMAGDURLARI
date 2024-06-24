package Chapter04;

import java.util.Random;

public class Q06 {
    public static void main(String[] args) {
        double alpha = Math.random() * 360;
        double radius = 40.0;
        double x1 = radius * Math.cos(alpha);
        double y1 = radius * Math.sin(alpha);
        alpha = Math.random() * 360;
        double x2 = radius * Math.cos(alpha);
        double y2 = radius * Math.sin(alpha);
        alpha = Math.random() * 360;
        double x3 = radius * Math.cos(alpha);
        double y3 = radius * Math.sin(alpha);
        double a = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2));
        double b = Math.sqrt(Math.pow(x3 - x1 , 2) + Math.pow(y3 - y1 , 2));
        double c = Math.sqrt(Math.pow(x3 - x2 , 2) + Math.pow(y3 - y2 , 2));
        double angle1 = Math.toDegrees(Math.acos((Math.pow(a , 2) + Math.pow(b , 2) - Math.pow(c , 2)) / (2 * a * b)));
        double angle2 = Math.toDegrees(Math.acos((Math.pow(c , 2) + Math.pow(b , 2) - Math.pow(a , 2)) / (2 * c * b)));
        double angle3 = Math.toDegrees(Math.acos((Math.pow(a , 2) + Math.pow(c , 2) - Math.pow(b , 2)) / (2 * a * c)));
        System.out.println(angle1);
        System.out.println(angle2);
        System.out.println(angle3);
    }
}
