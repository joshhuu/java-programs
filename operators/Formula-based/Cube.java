import java.util.*;
public class Cube {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        double area = 6*(a*a);
        double volume = Math.pow(a, 3);
        double perimeter = 12*a;

        System.out.printf("%f,%f,%f",area,volume,perimeter);
    }
}
