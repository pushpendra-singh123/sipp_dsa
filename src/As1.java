import static java.lang.Math.*;
public class As1 {
     static void printLab(){
        System.out.println("Welcome to Bridgelabz!");
    }
    static void add(int a,int b){
        System.out.println("Sum is : " + a+b);
    }
    static void cToF(long cel){
        long Fahrenheit = (cel * 9/5) + 32;
        System.out.println("In Fahrenheit : " + Fahrenheit);
    }
    static long AreaOfCircle(int r){
        return (long) PI * r * r;
    }
    static long volumeOfCylinder(int r, int h){
        return (long) PI * r * h;
    }
    static long simpleInterest(int p,int r,int t){
        long SI = (p*r*t)/100;
        return SI;
    }
    static long PerimeterOfRectangle(int l,int w){
        return 2*(l+w);
    }
    static long pow(int base,int exp){
        return (long) Math.pow(base, exp);
    }
    static float avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    static long convertKilometerToMiles(float km){
        return (long) (km * 0.621371);
    }

    public static void main(String[] args) {
        printLab();
        add(3,5);
        System.out.println("In Miles : "+convertKilometerToMiles(5));
    }
}
