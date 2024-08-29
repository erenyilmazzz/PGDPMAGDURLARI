package Chapter05;

public class Q19 {
    // önceki sorularla aynı mantık çözemedim
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <=  - i; j++) {
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
