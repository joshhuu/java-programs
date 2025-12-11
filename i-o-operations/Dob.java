import java.util.Scanner;
public class Dob {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m= sc.nextInt();
        int y= sc.nextInt();
        
        System.out.println(d+"/"+m+"/"+y);
        System.out.printf("%d/%d/%d",d,m,y);
    }
}
