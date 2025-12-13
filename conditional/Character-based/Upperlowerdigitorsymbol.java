import java.util.Scanner;
public class Upperlowerdigitorsymbol {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>= 'a' && ch<='z'){
            System.out.println("lower");
        }
        else if (ch>= 'A' && ch<='Z'){
            System.out.println("Upper");
        }
        else if (ch>= '0' && ch<='9') {
            System.out.println("number");
        }
        else{
            System.out.println("special character");
        }
    }
}
