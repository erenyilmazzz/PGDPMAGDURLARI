package Chapter05;

public class Q20 {
    public static void main(String[] args) {
        int count = 0;
        boolean isPrime;
        System.out.println("All the prime numbers between 2 and 1000 are:");
        for (int i = 2; i < 1000; i++) {
            isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;

                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%5d",i);
                count++;
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
