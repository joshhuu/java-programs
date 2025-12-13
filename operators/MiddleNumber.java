import java.util.*;
public class MiddleNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n%100;
        int digit = first/10;
        

        System.out.printf("%d",digit);
    }
}
