import java.util.Scanner;

public class Rightangleornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            int x, y, z; // z will be the largest side

            if (a >= b && a >= c) {
                z = a;
                x = b;
                y = c;
            } else if (b >= a && b >= c) {
                z = b;
                x = a;
                y = c;
            } else {
                z = c;
                x = a;
                y = b;
            }

            if (z * z == x * x + y * y) {
                System.out.println("Right-angled triangle");
            } else {
                System.out.println("Not a right-angled triangle");
            }

        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
