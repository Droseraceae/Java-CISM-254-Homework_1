import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		String input;
		String repeat;
		String reverse = "";
		Scanner keyboard = new Scanner(System.in);

		do {
			input = "";
			repeat = "";
			reverse = "";
			System.out.println("Enter your word. I will tell you if it is a palindrome.");
			input = keyboard.nextLine();

			
			for (int i = input.length() - 1; i >= 0; i--)
				reverse += input.charAt(i);

			if (input.toLowerCase().equals(reverse.toLowerCase()))
			{
				System.out.println("Your word is a palindrome!");
			} else {
				System.out.println("Your word is NOT a palindrome!");
			}

			System.out.println("Do you want to check another word? Enter 'Y' for yes.");
			repeat = keyboard.nextLine();
		}
		while (repeat.toUpperCase().equals("Y"));
		keyboard.close();
		System.exit(0);
	}
}