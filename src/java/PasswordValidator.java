package java;

import java.util.Scanner;

public class PasswordValidator {
	//Method to check if password meets the required conditions
	public static boolean isValidPassword(String password) { 
		if (password.length() < 8) { //Check if password length is at least 8
			return false;
		}
		
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasLetter = false;
		
		//Iterate through each character in the password
		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUpperCase = true; //Check if there is at least one upper case
			}
			if (Character.isDigit(ch)) {
				hasDigit = true; //Check if there is at least one digit
			}
			if (Character.isLetter(ch)) {
				hasLetter = true; //Check if there is at least one letter
			}
		}
		
		//Return true only if all conditions are met
		return hasUpperCase && hasDigit && hasLetter;
	}
	public static void main (String args []) {
		Scanner scanner = new Scanner(System.in); //Scanner to read user input
		System.out.println("Enter password: ");
		String password = scanner.nextLine(); // Read the input password
		scanner.close();
		
		//Validate the password and print the result
		if (isValidPassword(password)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}

