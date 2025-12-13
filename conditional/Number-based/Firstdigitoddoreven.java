import java.util.*;
public class Firstdigitoddoreven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = n/100 ;


        if(digit%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
