package Chapter02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();
        double secondsInAYear = 86400.0 * 365.0;
        double totalBirths = secondsInAYear / 7.0;
        double totalDeaths = secondsInAYear / 13.0;
        double totalImmigrants = secondsInAYear / 45.0;
        int people = 312032486;
        int totalPeople = people + (int) (totalBirths * numberOfYears) - (int) (totalDeaths * numberOfYears) + (int) (totalImmigrants *numberOfYears);
        System.out.println("Total people after " + numberOfYears + " years: "+ totalPeople);
    }
}
