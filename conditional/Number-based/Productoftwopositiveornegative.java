import java.util.Scanner;
public class Productoftwopositiveornegative {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int product = m*n;


        if(product>=0)
            System.out.println("Positive");
        else
            System.out.println("negative");
    }
}
