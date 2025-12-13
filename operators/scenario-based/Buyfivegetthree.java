import java.util.*;
public class Buyfivegetthree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int free = (n/8)*3;
        int topay = n-free;
        System.out.println(topay);

    }
}
