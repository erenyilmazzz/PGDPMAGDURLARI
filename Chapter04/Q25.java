package Chapter04;

public class Q25 {
    public static void main(String[] args) {
        char pl1 =(char)((int) (Math.random() * 26) + 65);
        char pl2 =(char)((int) (Math.random() * 26) + 65);
        char pl3 =(char)((int) (Math.random() * 26) + 65);
        int dig1 = (int) (Math.random() * 10);
        int dig2 = (int) (Math.random() * 10);
        int dig3 = (int) (Math.random() * 10);
        int dig4 = (int) (Math.random() * 10);
        System.out.println("The license plate is " + pl1 + pl2 + pl3 + " " + dig1 + dig2 + dig3 + dig4);
    }
}
