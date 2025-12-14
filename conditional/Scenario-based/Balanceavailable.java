import java.util.Scanner;

public class Balanceavailable {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balance = 1000;
        if(amount<=balance && amount%100==0)
            System.out.println("amount available and is divisible by 100");
        else 
            System.out.println("amount not available");
    }
}
