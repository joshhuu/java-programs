import java.util.*;
public class Candysplit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int candy = sc.nextInt();
        int people = sc.nextInt();

        int split = candy/people;

        System.out.println(split);

    }
}
