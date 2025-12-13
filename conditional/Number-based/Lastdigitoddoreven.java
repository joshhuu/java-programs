import java.util.*;
public class Lastdigitoddoreven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = n%10 ;


        if(digit%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
