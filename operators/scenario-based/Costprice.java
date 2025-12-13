import java.util.*;
public class Costprice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double sellingprice = sc.nextDouble();
        double loss = sc.nextDouble();

        double costprice = sellingprice+ loss;

        System.out.println(costprice);

    }
}
