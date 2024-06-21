package Chapter03;

public class Q04 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12 + 1);
        String monthName;
        switch (month){
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "Septemeber";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> monthName = "Invalid value";
        }
        System.out.println("The month is " + monthName);
    }
}
