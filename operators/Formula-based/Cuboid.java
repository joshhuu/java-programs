import java.util.*;
public class Cuboid {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double length= sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        double area= 2*(length*breadth+breadth*height+height*length);
        double volume = length*breadth*height;
        System.out.printf("%f,%f",area,volume);
    }
}
