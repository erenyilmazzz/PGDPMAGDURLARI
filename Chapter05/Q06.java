package Chapter05;

public class Q06 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-6s%-15s%-15s\n","Miles","Kilometers","|","Kilometers","Miles");
        int j = 20;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-15d%-15.3f%-6s%-15d%-15.3f\n", i, i * 1.609, "|", j, j / 1.609);
            j += 5;
        }
    }
}
