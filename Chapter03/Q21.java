package Chapter03;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a day, a month and year: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if (month < 3) {
            month += 12;
            year--;
        }
        int dayOfWeek =(day + (26 * (month + 1) / 10) + year % 100 + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
        String Day = switch (dayOfWeek){
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "False day";
        };
        System.out.println("Day of week is " + Day);
    }
}
