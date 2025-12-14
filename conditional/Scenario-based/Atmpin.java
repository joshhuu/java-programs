import java.util.Scanner;

public class Atmpin {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if(pin==9798)
            System.out.println("Transaction success");
        else 
            System.out.println("Incorrect pin");
    }
}
