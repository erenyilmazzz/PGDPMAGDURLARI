package Chapter04;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year and then the first three letters of the month: ");
        int year = scanner.nextInt();
        String month = scanner.next().toLowerCase();

        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        int days = switch (month){
            case "jan","mar","may","jul","aug","oct","dec" -> 31;
            case "feb" -> isLeapYear ? 29 : 28;
            case "apr","jun","sep","nov" -> 30;
            default -> 0;
        };

        System.out.println(month + " " + year + " has " + days + " days");
    }
}
