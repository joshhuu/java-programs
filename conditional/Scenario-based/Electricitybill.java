import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity usage: ");
        int usage = sc.nextInt();
        int bill = 0;

        if (usage <= 100) {
            bill = 0;
        } 
        else if (usage <= 300) {
            bill = (usage - 100) * 5;
        } 
        else {
            bill = (200 * 5) + (usage - 300) * 10;
        }
        if (usage > 500) {
            bill += 250;
        }

        System.out.println("Electricity Bill:" + bill);
    }
}
