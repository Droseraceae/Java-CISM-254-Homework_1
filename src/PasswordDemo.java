import java.util.Scanner;

/**
 * Chapter 8
 * Programming Challenge 5: Password Verifier
 * This program demonstrates the PasswordVerifier class.
 * 
 * @Author Josh Alcoba
 * 2/6/2016
 */

public class PasswordDemo {
	public static void main(String[] args) {
		String input;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a password: ");
		input = keyboard.nextLine();

		while (!PasswordVerifier.isValid(input)) {
			System.out.println("Invalid password.");
			System.out.print("Enter a password: ");
			input = keyboard.nextLine();
		}

		System.out.println("Valid password.");
		keyboard.close();
	}
}