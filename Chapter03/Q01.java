package Chapter03;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        double root1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
        double root2 = (-b - Math.pow(discriminant,0.5)) / (2 * a);
        if(discriminant == 0){
            System.out.println("The equation has one root: " + root1);
        } else if (discriminant > 0) {
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
