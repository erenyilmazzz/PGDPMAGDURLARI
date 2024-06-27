package Chapter05;

public class Q07 {
    public static void main(String[] args) {
        double tuition = 0;
        for (int i = 0; i < 10; i++) {
            if (i < 4){
                tuition += 10000;
            }
            tuition *= 1.05;
            System.out.println(tuition);
        }
        System.out.println("The tuition of 4 years is worth " + tuition + " in 10 years");
    }
}
