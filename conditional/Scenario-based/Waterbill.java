import java.util.Scanner;

public class Waterbill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water usage (in liters): ");
        int usage = sc.nextInt();

        int bill = 0;

        if (usage <= 1000) {
            bill = 0;
        } 
        else if (usage <= 3000) {
            bill = ((usage - 1000) / 1000) * 5;
        } 
        else {
            bill = (2000 / 1000) * 5 + ((usage - 3000) / 1000) * 10;
        }

        System.out.println("Water Bill: ₹" + bill);
        sc.close();
    }
}
