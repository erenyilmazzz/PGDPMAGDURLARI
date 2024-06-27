package Chapter05;

public class Q03 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Kilograms", "Pounds");
        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%-10d%-10.1f\n", i, i * 2.2);
        }
    }
}
