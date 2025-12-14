import java.util.Scanner;

public class YearMonthValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return;
        }

        int days;

        if (month == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else {
            days = 31;
        }

        System.out.println("Valid month");
        System.out.println("Number of days: " + days);
    }
}
