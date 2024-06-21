package Chapter03;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the wind speed: ");
        double windSpeed = scanner.nextDouble();
        System.out.print("Write the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        if (windSpeed < 2) {
            System.out.println("Invalid wind speed");
        } else if (temperature > 41 || temperature < -58) {
            System.out.println("Invalid temperature");
        }else {
            double windChillIndex = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
            System.out.println("The wind chill index is " + windChillIndex);
        }
    }
}
