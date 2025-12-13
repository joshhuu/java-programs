import java.util.*;
public class DifferenceEvenodd {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int digit = m-n;
        if(digit%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
