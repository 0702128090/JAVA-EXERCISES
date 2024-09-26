//A JAVA PROGRAM THAT ASKS FOR A PASSWORD AND ALLOWS
//THE USER 3 ATTEMPTS TO INPUT THE CORRECT PASSWORD USING A WHILE LOOP

import java.util.Scanner;

public class PASSWORDEXERCISE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "NASSER";
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Enter the Password: ");
            String input = scanner.nextLine();
            if (input.equals(correctPassword)) {
                System.out.println("Success!correctPassword.");
            } else {
                attempts--;
                System.out.println("Incorrect Password.");
            }
            if (attempts == 0) {
                System.out.println("Account blocked.");
            }
            scanner.close();
        }
    }

}
