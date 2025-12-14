import java.util.Scanner;

public class Speed {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();

        if(speed>=100)
            System.out.println("Speeding");
        else 
            System.out.println("not speeding");
    }
}
