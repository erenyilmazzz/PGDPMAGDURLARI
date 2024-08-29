package Chapter05;

import java.util.Scanner;

// anlayamadım gpt den yardım alarak yaptım

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 15: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%3d", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }

    }
}
