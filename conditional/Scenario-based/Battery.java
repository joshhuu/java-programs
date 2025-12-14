import java.util.Scanner;

public class Battery {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();

        if(battery<=15)
            System.out.println("Low battery");
        else if (battery>15 && battery<=95) {
             System.out.println(" More than 50 percent used");
        }
        else
            System.out.println("battery full");
    }
}
