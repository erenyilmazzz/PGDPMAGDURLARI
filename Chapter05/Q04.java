package Chapter05;

public class Q04 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");
        for (int i = 1; i <= 10; i ++) {
            System.out.printf("%-10d%-10f\n", i, i * 1.609);
        }
    }
}
