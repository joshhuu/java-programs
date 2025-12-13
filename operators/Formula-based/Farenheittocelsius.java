import java.util.*;
public class Farenheittocelsius {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();

        double celsius = (f-32)* 5.0/9;

        System.out.println(celsius);
    }
}
