import java.util.*;
public class Sumoffirstandlastno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int digit = n%10;
        digit +=n/100;

        System.out.printf("%d",digit);
    }
}
