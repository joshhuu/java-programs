import java.util.Scanner;
public class Oct {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String oct= sc.nextLine();
        int decimal= Integer.parseInt(oct,8);

        System.out.println(decimal);
    }
}
