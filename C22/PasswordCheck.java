import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java123";

        System.out.print("Enter your password: ");
        String userInput = scanner.nextLine(); // Read what the user types

        if (correctPassword.equals(userInput)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Wrong password!");
        }

        scanner.close();
    }
}