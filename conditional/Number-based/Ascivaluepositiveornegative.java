import java.util.Scanner;

public class Ascivaluepositiveornegative {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ascii = (int) c;


        if(ascii%2==0)
            System.out.println("Asci value is even");
        else
            System.out.println("Asci value is odd");
    }
}
