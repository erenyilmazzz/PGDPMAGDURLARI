package Chapter02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timeOffset = scanner.nextInt();
        long totalMiliseconds = System.currentTimeMillis();
        long totalSeconds = totalMiliseconds / 1000;
        long currentsecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        long currentHour = currentHours + timeOffset;
        if (currentHour < 0){
            currentHour += 24;
        } else if (currentHour > 24){
            currentHour -= 24;
        }
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentsecond);
    }
}
