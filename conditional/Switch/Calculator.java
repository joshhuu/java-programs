import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Choose 1 for addition\n Choose 2 for Subtraction\n Choose 3 for Multiplication\n Choose 4 for Division ");
        int choice = sc.nextInt();

        switch(choice){
            
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;   
        }
    }
}
