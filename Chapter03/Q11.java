package Chapter03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month and a year: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        String Month = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "Septemeber";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid value";
        };
        boolean isLapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = switch (month){
            case 1 -> 31;
            case 2 -> (isLapYear ? 29 : 28);
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };
        System.out.println(Month + " " + year + " had " + days + " days.");
    }
}
