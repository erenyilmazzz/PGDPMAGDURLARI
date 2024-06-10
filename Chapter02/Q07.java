package Chapter02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double minutes = scanner.nextDouble();
        double minutes1 = minutes;
        double years = minutes1 / (60 * 24 * 365);
        minutes1 = minutes1 % (60 * 24 * 365);
        double days = minutes1 / (60 * 24);
        System.out.println(minutes + " minutes is approximately " + (int) years + " years and " + (int) days + " days");
    }
}
