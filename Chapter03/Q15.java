package Chapter03;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lottery = (int)(Math.random() * 1000);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = scanner.nextInt();
        int guess1 = guess % 10;
        guess = guess / 10;
        int guess2 = guess % 10;
        guess = guess / 10;
        int guess3 = guess % 10;
        int lottery1 = lottery % 10;
        lottery = lottery / 10;
        int lottery2 = lottery % 10;
        lottery = lottery / 10;
        int lottery3 = lottery % 10;
        if (guess1 == lottery1 && guess2 == lottery2 && guess3 == lottery3) {
            System.out.println("Congratulations! You win $10,000!");
        } else if ((guess1 == lottery1 && guess2 == lottery3 && guess3 == lottery2) ||
                (guess1 == lottery2 && guess2 == lottery3 && guess3 == lottery1) ||
                (guess1 == lottery2 && guess2 == lottery1 && guess3 == lottery3) ||
                (guess1 == lottery3 && guess2 == lottery2 && guess3 == lottery1) ||
                (guess1 == lottery3 && guess2 == lottery1 && guess3 == lottery2)) {
            System.out.println("Congratulations! You win $3,000!");
        } else if (guess1 == lottery1 || guess1 == lottery2 || guess1 == lottery3 || guess2 == lottery1 || guess2 == lottery2 || guess2 == lottery3 || guess3 == lottery1 || guess3 == lottery2 || guess3 == lottery3) {
            System.out.println("Congratulations! You win $1,000!");
        }
    }
}
