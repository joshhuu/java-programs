import java.util.*;
public class Sphere {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double area = 4*Math.PI*r*r;
        double volume =(4.0/3)*Math.PI*r*r*r;


        System.out.printf("%f,%f",area,volume);
    }
}
