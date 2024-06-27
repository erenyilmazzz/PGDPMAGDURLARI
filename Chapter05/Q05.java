package Chapter05;

public class Q05 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-1s%15s%15s\n","Kilograms","Pounds","|","Pounds","Kilograms");
        int j = 20;
        for (int i = 1; i < 200; i += 2) {
                System.out.printf("%-15d%-15.1f%-1s%15d%15.2f\n", i, (i * 2.2), "|", j, (j / 2.2));
                j += 5;
        }
    }
}
