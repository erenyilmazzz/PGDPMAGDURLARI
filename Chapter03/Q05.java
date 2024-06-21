package Chapter03;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter todays day (a number between 0 and 6): ");
        int num = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapse = scanner.nextInt();
        String today = switch (num){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid";
        };
        elapse %= 7;
        String day = switch (elapse){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid";
        };
        System.out.println("Today is " + today + " and the future day is " + day);
    }
}
