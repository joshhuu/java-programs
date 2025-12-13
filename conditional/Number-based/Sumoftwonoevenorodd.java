import java.util.*;
public class Sumoftwonoevenorodd {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = m+n;


        if(sum%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
