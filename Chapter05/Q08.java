package Chapter05;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        System.out.print("Enter the names and scores of the students: ");

        double highestScore = 0.0;
        String highestScoreName = "";
        for (int i = 0; i < students; i++) {
            String name = input.next();
            double score = input.nextDouble();
            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }
        System.out.println("The highest score is " + highestScore + " achieved by " + highestScoreName);
    }
}
