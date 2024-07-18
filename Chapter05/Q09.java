package Chapter05;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        System.out.print("Enter the names and scores of the students: ");

        double highestScore = 0.0;
        String highestScoreName = "";
        double secondHighestScore = 0.0;
        String secondHighestScoreName = "";
        for (int i = 0; i < students; i++) {
            String name = input.next();
            double score = input.nextDouble();
            if (score > secondHighestScore) {
                secondHighestScore = score;
                secondHighestScoreName = name;
            }
            if (score > highestScore) {
                double tempScore = highestScore;
                highestScore = score;
                secondHighestScore = tempScore;
                String tempScoreName = highestScoreName;
                highestScoreName = name;
                secondHighestScoreName = tempScoreName;
            }
        }
        System.out.println("Highest score is " + highestScore + " achieved by " + highestScoreName);
        System.out.println("Second highest score is " + secondHighestScore + " achieved by " + secondHighestScoreName);
    }
}
