import java.util.Scanner;

public class Season {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month){
            
            case 11:
            case 12:
            case 1:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 2:
            case 3:
                System.out.println("Fall");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Rainy");
                break;
        }
    }
}
