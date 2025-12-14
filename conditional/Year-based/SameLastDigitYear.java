import java.util.Scanner;

public class SameLastDigitYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        int last1 = y1 % 10;
        int last2 = y2 % 10;

        if (last1 == last2) {
            System.out.println("Same last digit");
        } else {
            System.out.println("Different last digit");
        }
    }
}
