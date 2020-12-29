/**
 * Chapter 8 Programming Challenge 5: Password Verifier The PasswordVerifier
 * class stores data about a user's password.
 * 
 * @Author Josh Alcoba 
 * 2/6/16
 */

public class PasswordVerifier {
	
	private static final int MIN_PASSWORD_LENGTH = 6;
	private static boolean status, upper, lower, digit = false;
	

	public static boolean isValid(String str) {

		if (str.length() >= MIN_PASSWORD_LENGTH && hasUpperCase(str) && hasLowerCase(str) && hasDigit(str))
			status = true;
		else {
			status = false;
			upper = false;
			lower = false;
			digit = false;
		}
		return status;
	}

	private static boolean hasUpperCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!upper && Character.isUpperCase(str.charAt(i))) {
				upper = true;
				break;
			}
		}
		return upper;
	}

	private static boolean hasLowerCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!lower && Character.isLowerCase(str.charAt(i))) {
				lower = true;
				break;
			}
		}
		return lower;
	}

	private static boolean hasDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!digit && Character.isDigit(str.charAt(i))) {
				digit = true;
				break;
			}
		}
		return digit;
	}
}
