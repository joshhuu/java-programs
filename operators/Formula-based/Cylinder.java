import java.util.*;
public class Cylinder {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double area = 2*Math.PI*r*(h+r);
        double volume =Math.PI*r*r*h;


        System.out.printf("%f,%f",area,volume);
    }
}
