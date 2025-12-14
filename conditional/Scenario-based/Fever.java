import java.util.Scanner;

public class Fever {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if(temp>=100)
            System.out.println("high fever");
        else 
            System.out.println("not high fever");
    }
}
