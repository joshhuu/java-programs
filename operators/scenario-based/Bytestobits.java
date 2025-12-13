import java.util.*;
public class Bytestobits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int bytes = sc.nextInt();
        
        double bits = bytes*8;

        System.out.println(bits);

    }
}
