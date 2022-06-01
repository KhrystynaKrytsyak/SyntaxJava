package com.syntax.class08;

import java.util.Scanner;

public class secretNumTask {

	public static void main(String[] args) {
		
		/*
		 * declare a secret number; you want user to ask user to guess your secret
		 * number your code should keep asking to guess until user gets your secret
		 * number once user gets the secret numbers --> you got it!
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your secret number?");
		int secretNum = scan.nextInt();

		while (secretNum != 45)
			System.out.println("Enter secret number");
		secretNum = scan.nextInt();
		System.out.println("Your secret number is correct");

		scan.close();

	}

}
