package Chapter03;

import java.util.Random;

public class Q24 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 13 + 1);
        int random2 = (int) (Math.random() * 4 + 1);
        String card = switch (random){
            case 1 -> "Ace";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> null;
        };
        String type = switch (random2){
            case 1 -> "Clubs";
            case 2 -> "Diamonds";
            case 3 -> "Hearts";
            case 4 -> "Spades";
            default -> null;
        };
        System.out.println("The card you picked is " + card + " of " + type);
    }
}
