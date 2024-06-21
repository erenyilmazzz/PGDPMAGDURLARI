package Chapter03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the result of the coin toss (head or tail): ");
        String guess = scanner.nextLine();
        int random = (int) (Math.random() * 2);
        if (guess.equals("head")) {
            System.out.println("Your guess was " + (random == 0));
        }else if (guess.equals("tail")) {
            System.out.println("Your guess was " + (random == 1));
        } else {
            System.out.println("Invalid guess");
        }
    }
}
