package Chapter04;

public class Q03 {
    public static void main(String[] args) {
        double atlantaX = 33.7489954;
        double atlantaY = -84.3879824;
        double orlandoX = 28.5383355;
        double orlandoY = -81.3792365;
        double savannahX = 32.0835407;
        double savannahY = -81.0998342;
        double charlotteX = 35.2270869;
        double charlotteY = -80.8431267;

        double charAtl = Math.sqrt(Math.pow(atlantaX - charlotteX, 2) + Math.pow(atlantaY - charlotteY, 2));
        double charSav = Math.sqrt(Math.pow(savannahX - charlotteX, 2) + Math.pow(savannahY - charlotteY, 2));
        double savOrl = Math.sqrt(Math.pow(savannahX - orlandoX, 2) + Math.pow(savannahX - orlandoY, 2));
        double orlChar = Math.sqrt(Math.pow(orlandoX - charlotteX, 2) + Math.pow(orlandoY - charlotteY, 2));
        double orlAtl = Math.sqrt(Math.pow(orlandoX - atlantaX, 2) + Math.pow(orlandoY - atlantaY, 2));
        double s1 = (charAtl + orlAtl + orlChar) / 2;
        double area1 = Math.sqrt(s1 * (s1 - charAtl) * (s1 - orlAtl) * (s1 - orlChar));
        double s2 = (charSav + savOrl + orlChar) / 2;
        double area2 = Math.sqrt(s2 * (s2 - charSav) * (s2 - orlAtl) * (s2 - orlChar));
        double totalArea = area1 + area2;

        System.out.println("The total area covered is " + totalArea);
    }
}
