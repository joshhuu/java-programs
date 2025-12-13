import java.util.*;
public class Simpleinterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        double days = sc.nextDouble();
        double interest = 0.18;
        double si = (cost*interest*days)/100;

        System.out.println(si);

    }
}
