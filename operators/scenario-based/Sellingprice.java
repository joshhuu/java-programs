import java.util.*;
public class Sellingprice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double costprice = sc.nextDouble();
        double profit = sc.nextDouble();

        double sellingprice = costprice+ profit;

        System.out.println(sellingprice);

    }
}
