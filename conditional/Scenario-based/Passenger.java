import java.util.Scanner;

public class Passenger {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=18)
            System.out.println("100 Rupees");
        else if (age>=18 && age<=50) {
            System.out.println("200 Rupees");
        }
        else 
            System.out.println("150 rupee");
    }
}
