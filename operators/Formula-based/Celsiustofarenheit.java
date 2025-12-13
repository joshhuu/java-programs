import java.util.*;
public class Celsiustofarenheit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        double Farenheit = (c*9.0/5)+32;

        System.out.println(Farenheit);
    }
}

