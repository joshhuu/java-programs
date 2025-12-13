import java.util.*;
public class Distancetwopoints {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double x1= sc.nextDouble();
        double x2= sc.nextDouble();
        double y1= sc.nextDouble();
        double y2= sc.nextDouble();
        double x = (x2-x1)*(x2-x1);
        double y = (y2-y1)*(y2-y1);
        double distance = Math.sqrt(x+y);

        System.out.println(distance);
    }
}
