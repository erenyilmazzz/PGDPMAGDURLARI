package Chapter03;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for rock(1), paper(2) or scissor(0): ");
        int num = scanner.nextInt();
        int pc = (int) (Math.random() * 3);
        String pcChoice = switch (pc){
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> "something else";
        };
        String myChoice = switch (num){
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> "something else";
        };
        if (pc == num){
            System.out.println("The computers choice is " + pcChoice + ". Your choice is " + myChoice + ". It's a draw");
        } else if ((pc == 2 && num == 0) || (pc == 1 && num == 2) || (pc == 0 && num == 1)) {
            System.out.println("The computers choice is " + pcChoice + ". Your choice is " + myChoice + ". You win");
        } else{
            System.out.println("The computers choice is " + pcChoice + ". Your choice is " + myChoice + ". You lose");
        }
    }
}
