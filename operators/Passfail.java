import java.util.*;
public class Passfail {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        System.out.println((marks>50)? "Pass":"Fail");
    }
}
