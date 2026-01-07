import java.util.Scanner;
public class PasswordReset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password;
        String confirmPassword;

        do {
            System.out.print("Enter new password: ");
            password = sc.nextLine();

            System.out.print("Confirm password: ");
            confirmPassword = sc.nextLine();

            if (!password.equals(confirmPassword)) {
                System.out.println("Passwords do not match. Try again.\n");
            }

        } while (!password.equals(confirmPassword));

        System.out.println("Password reset successful.");

    }
}
