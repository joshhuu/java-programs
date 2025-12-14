import java.util.Scanner;

public class Dataconsumed {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if(data<=1500)
            System.out.println("Low Data");
        else if (data>1501 && data<=2000) {
             System.out.println(" More than 50 percent used");
        }
        else
            System.out.println("Data over");
    }
}
