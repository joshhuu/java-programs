import java.util.*;
public class Greatestofthree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println((x>y& x>z)? "X greater":(y>z)? "Y greater": "Z greater");
    }
}
