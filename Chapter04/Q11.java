package Chapter04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = scanner.nextInt();
        String num = "";

        if (decimal > 9) {
            num = switch (decimal){
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> "Wrong number";
            };
        } else {
            num = Integer.toString(decimal);
        }

        if (num.equals("Wrong number")) {
            System.out.println("You entered an invalid number");
        } else {
            System.out.println("The hex value is " + num);
        }
    }
}
