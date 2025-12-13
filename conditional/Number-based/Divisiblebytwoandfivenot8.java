import java.util.*;
public class Divisiblebytwoandfivenot8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if(n%2==0 && n%5==0 && n%8!=0 )
            System.out.println("Divisible by 2 or 5 not by 8");
        else
            System.out.println("Not Divisible by 2 or 5 or by 8");
    }
}
