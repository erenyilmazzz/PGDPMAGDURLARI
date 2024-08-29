package Chapter05;

public class Q18 {

    // yapamadım bunu yan yana
    public static void main(String[] args) {
        System.out.printf("%-12s\n", "Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.printf("%-2d",j);
            }
            System.out.println();
        }
        System.out.printf("%-12s","Pattern B\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >=i; j--) {
                System.out.printf("%-2d",j);
            }
            System.out.println();
        }
        System.out.printf("%-12s","Pattern C\n");
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j >0; j--) {
                System.out.printf("%10s%2d","",j);
            }
            System.out.println();
        }
    }
}
