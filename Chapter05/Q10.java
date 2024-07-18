package Chapter05;

public class Q10 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count ++;
            }

            if (count % 11 == 0) {
                System.out.println();
                count = 1;
            }
        }
    }
}
