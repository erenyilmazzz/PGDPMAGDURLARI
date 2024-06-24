package Chapter04;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String first = input.nextLine().toUpperCase();
        int second = first.charAt(1);

        String bölüm = switch (first.charAt(0)){
            case 'M' -> "Mathematics ";
            case 'C' -> "Computer Science ";
            case 'I' -> "Information Technology ";
            default -> "False input ";
        };
        String year = switch (second % 48){
            case 1 -> "Freshman";
            case 2 -> "Sophomore";
            case 3 -> "Junior";
            case 4 -> "Senior";
            default -> "False input";
        };

        if (bölüm.equals("False input ") || year.equals("False input")) {
            System.out.println("Invalid input");
        }else {
            System.out.println(bölüm + year);
        }
    }
}
