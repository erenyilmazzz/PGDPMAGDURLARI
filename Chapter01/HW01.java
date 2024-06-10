package Chapter01;

public class HW01 {
    public static void main(String[] args) {
        //1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
        //1.2
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }
        //1.3
        System.out.println("     J     A    V     V    A    ");
        System.out.println("     J    A A    V   V    A A   ");
        System.out.println(" J   J   AAAAA    V V    AAAAA  ");
        System.out.println("  J J   A     A    V    A     A ");
        //1.4
        System.out.println("a   a^2   a^3");
        for (int i = 1; i <5; i++) {
            if ((i*i*i)/10==0) System.out.println(i+"    "+i*i+"    "+i*i*i);
            else if ((i*i)/10==0)System.out.println(i+"    "+i*i+"    "+i*i*i);
            else System.out.println(i+"    "+i*i+"   "+i*i*i);
        }
        //1.5
        System.out.println(((9.5*4.5)-(2.5*3))/(45.5-3.5));
        //1.6
        int summe=0;
        for (int i = 1; i < 10; i++) {
            summe+=i;
        }
        System.out.println(summe);
        //1.7
        double pi1=4;
        int even=0;
        double temp=1;
        for (int i = 3; i < 12; i+=2) {
            if (even%2==0)temp-=1.0/i;
            else temp+=1.0/i;
            even++;
        }
        pi1*=temp;
        System.out.println(pi1);

        double pi2=4;
        int even2=0;
        double temp2=1;
        for (int i = 3; i < 14; i+=2) {
            if (even2%2==0)temp2-=1.0/i;
            else temp2+=1.0/i;
            even2++;
        }
        pi2*=temp2;
        System.out.println(pi2);
        //1.8
        double radius=5.5;
        double area=radius*radius*Math.PI;
        double perimeter= 2*radius*Math.PI;
        System.out.println("Area of the circle: "+area);
        System.out.println("Perimeter of the circle: "+perimeter);
        //1.9
        double width=4.5;
        double height=7.9;
        double area1=width*height;
        System.out.println("Area of the rectangle: "+area1);
        //1.10
        int totalSeconds= (45 * 60) + 30;
        double KmPerHour= 14.0*(3600.0/totalSeconds);
        double milesPerHour= KmPerHour/1.6;
        System.out.println(milesPerHour);
        //1.11
        double secondsInAYear=86400.0*365.0;
        double totalBirths=secondsInAYear/7.0;
        double totalDeaths=secondsInAYear/13.0;
        double totalImmigrants=secondsInAYear/45.0;
        int totalPeople=312032486;
        System.out.println("Total people after 1 year: "+(totalPeople+=(int)totalBirths+(int)totalImmigrants-(int)totalDeaths));
        System.out.println("Total people after 2 years: "+(totalPeople+=(int)totalBirths+(int)totalImmigrants-(int)totalDeaths));
        System.out.println("Total people after a year: "+(totalPeople+=(int)totalBirths+(int)totalImmigrants-(int)totalDeaths));
        System.out.println("Total people after a year: "+(totalPeople+=(int)totalBirths+(int)totalImmigrants-(int)totalDeaths));
        System.out.println("Total people after a year: "+(totalPeople+=(int)totalBirths+(int)totalImmigrants-(int)totalDeaths));
        //1.12
        int totalSecond=3600+40*60+35;
        double milePerHour=24*(3600.0/totalSecond);
        double kmPerHour=milePerHour*1.6;
        System.out.println(kmPerHour);
        //1.13
        double x=((44.5*0.55)-(50.2*5.9))/((3.4*0.55)-(50.2*2.1));
        double y=((3.4*5.9)-(44.5*2.1))/((3.4*0.55)-(50.2*2.1));
        System.out.println("x: "+ x);
        System.out.println("y: "+ y); 
    }
}
