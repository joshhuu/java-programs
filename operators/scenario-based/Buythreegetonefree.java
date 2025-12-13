import java.util.*;
public class Buythreegetonefree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int free = n/4;
        int topay = n-free;
        System.out.println(topay);

    }
}
