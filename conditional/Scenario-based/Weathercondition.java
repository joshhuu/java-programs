import java.util.Scanner;

public class Weathercondition {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if(temp<=10)
            System.out.println("Cold");
        else if (temp>=10 && temp<=30) {
            System.out.println("Warm");
        }

            System.out.println("Hot");
    }
}
