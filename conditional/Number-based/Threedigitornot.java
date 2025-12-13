import java.util.*;
public class Threedigitornot {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=100 && n<=99)
            System.out.println("Three digit number");
        else
            System.out.println("Not a three digit number");
    }
}
