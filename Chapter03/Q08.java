package Chapter03;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three different integer numbers in a row: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c > a && c > b){
            if (b > a) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(b + " " + a + " " + c);
            }
        } else if (b > c && b > a) {
            if (a > c){
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else {
            if (b > c){
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
    }
}
