import java.util.Scanner;
public class Alphabetornot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);

        if(ch>= 'a' && ch<='z')
            System.out.println("Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}
