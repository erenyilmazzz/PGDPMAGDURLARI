package Chapter05;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter as many numbers as you wish (0 ends it): ");

        double sum = 0;
        int positive = 0;
        int negative = 0;
        int totalNumbers = 0;

            while (true) {
                int num = Integer.parseInt(input.next());
                sum += num;
                if (num == 0) {
                    break;
                }
                totalNumbers++;

                if (num > 0) {
                    positive ++;
                } else {
                    negative ++;
                }
            }
            if (totalNumbers > 0) {
                System.out.println("The total number of positive numbers is: " + positive);
                System.out.println("The total number of negative numbers is: " + negative);
                System.out.println("The total is: " + sum);
                System.out.println("The average is " + (sum / totalNumbers));
            } else {
                System.out.println("No numbers were entered except 0");
            }
    }
}
