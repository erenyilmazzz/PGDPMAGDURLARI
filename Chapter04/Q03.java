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
        double radius = 6371.01;

        double charAtl = radius * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(charlotteX)) +
                         Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(charlotteX)) *
                         Math.cos(Math.toRadians(atlantaY) - Math.toRadians(charlotteY)));
        double charSav = radius * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(charlotteX)) +
                Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(charlotteX)) *
                        Math.cos(Math.toRadians(savannahY) - Math.toRadians(charlotteY)));
        double savOrl = radius * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(orlandoX)) +
                Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoX)) *
                        Math.cos(Math.toRadians(savannahY) - Math.toRadians(orlandoY)));
        double orlChar = radius * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(orlandoX)) +
                Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(orlandoX)) *
                        Math.cos(Math.toRadians(charlotteY) - Math.toRadians(orlandoY)));
        double orlAtl = radius * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(orlandoX)) +
                Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(orlandoX)) *
                        Math.cos(Math.toRadians(atlantaY) - Math.toRadians(orlandoY)));
        double s1 = (charAtl + orlAtl + orlChar) / 2;
        double area1 = Math.sqrt(s1 * (s1 - charAtl) * (s1 - orlAtl) * (s1 - orlChar));
        double s2 = (charSav + savOrl + orlChar) / 2;
        double area2 = Math.sqrt(s2 * (s2 - charSav) * (s2 - orlAtl) * (s2 - orlChar));
        double totalArea = area1 + area2;

        System.out.println("The total area covered is " + totalArea);
    }
}
