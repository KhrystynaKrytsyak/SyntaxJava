
package com.syntax.class08;

import java.util.Scanner;

public class CreditCardTask {

	public static void main(String[] args) {
		
		//create a program that will keep asking user to apply for a credit card.
		//As soon as you get "yes" from a user program should stop asking
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please apply for a credit card");
		String answer="yes";
		
		do {	
			System.out.println("Please apply for a credit card");
			answer=scan.nextLine();
		} while(!answer.equals("yes"));
		System.out.println("Thank you");
	}		
}


