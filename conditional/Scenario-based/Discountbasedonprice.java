import java.util.*;
public class Discountbasedonprice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double dprice = 0;
        if(price>0 && price<=500){
            dprice = (price*0.90);
        }
        else if(price>500&& price>=800){
            dprice = (price*0.75);
        }
        else{
            dprice = (price*0.50);
        }
    System.out.println("Discounted Price"+ dprice);
    }
}
