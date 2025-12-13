import java.util.*;
public class Perimeterrectangle {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Double length = sc.nextDouble();
    Double breadth= sc.nextDouble();

    Double perimeter = 2*(length+breadth);

    System.out.println(perimeter);
}
}

