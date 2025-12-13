import java.util.*;
public class Discount{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        
        double discount = price*0.75;

        System.out.println(discount);

    }
}