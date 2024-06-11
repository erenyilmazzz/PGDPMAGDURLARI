package Chapter02;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kg: ");
        double waterWeight = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double startingTemp = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = scanner.nextDouble();
        double energyNeeded = waterWeight * (finalTemp - startingTemp) * 4184;
        System.out.println("The energy needed is " + energyNeeded);
    }
}
