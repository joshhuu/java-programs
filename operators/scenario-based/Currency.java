import java.util.Scanner;

public class Currency {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        
        int n2000 = amount/2000;
        amount%=2000;

        int n500 = amount/500;
        amount%=500;

        int n200=amount/200;
        amount%=200;

        int n100=amount/100;
        amount%=100;

        System.out.printf("used 2000:%d\n",n2000);
        System.out.printf("used 500:%d\n",n500);
        System.out.printf("used 200:%d\n",n200);
        System.out.printf("used 100:%d\n",n100);

    }
}
