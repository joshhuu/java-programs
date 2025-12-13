import java.util.Scanner;
public class Twonumbersamelastdigit {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int ml = n%10 ;
        int nl = n%10;


        if(ml==nl)
            System.out.println("Same last digit");
        else
            System.out.println(" not Same last digit");
    }
}
