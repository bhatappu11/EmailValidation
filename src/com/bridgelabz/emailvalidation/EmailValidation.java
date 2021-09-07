package com.bridgelabz.emailvalidation;

import java.util.Scanner;
import java.util.regex.*;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the email");
		String email = scanner.nextLine();
		System.out.println("Is the email valid?");
		if(checkForValidEmail(email))
			System.out.println("It is valid");
		else
			System.out.println("It is invalid");
		scanner.close();

	}

	private static boolean checkForValidEmail(String email) {
		String regex = "[a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9]@[a-zA-Z0-9]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
