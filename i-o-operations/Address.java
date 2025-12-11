import java.util.Scanner;
public class Address {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String add= sc.nextLine();
        int code= sc.nextInt();

        System.out.println(add + "\n" + code);
        System.out.printf("%s\n%d",add,code);
    }
}
