package Chapter05;

public class Q15 {
    public static void main(String[] args) {
        char a = '!';
        char b = '~';
        int count = 1;
        for (int i = a; i <= b; i++) {
            System.out.print((char) i + " ");
            if (count % 11 == 0) {
                System.out.println();
            }
            count++;
        }
    }
}
