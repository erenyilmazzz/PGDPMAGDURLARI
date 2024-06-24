package Chapter04;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letter = scanner.next();
        int grade = switch (letter){
            case "A" -> 4;
            case "B" -> 3;
            case "C" -> 2;
            case "D" -> 1;
            case "F" -> 0;
            default  -> 0;
        };
        if (!letter.equals("A") && !letter.equals("B") && !letter.equals("C") && !letter.equals("D") && !letter.equals("F")) {
            System.out.println("Invalid grade");
        } else {
            System.out.println("The grade is " + grade);
        }
    }
}
