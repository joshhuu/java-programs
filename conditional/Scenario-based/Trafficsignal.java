import java.util.Scanner;

public class Trafficsignal {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char color = sc.next().toUpperCase().charAt(0);

        if(color>='G')
            System.out.println("Go");
        else if (color>='Y') {
            System.out.println("Wait");
        }
        else 
            System.out.println("Stop");
    }
}
