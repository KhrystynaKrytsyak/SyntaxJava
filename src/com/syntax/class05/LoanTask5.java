
package com.syntax.class05;

import java.util.Scanner;

public class LoanTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the amount of loan that is needed?");
		int loan = input.nextInt();
		if (loan <= 200000) {
			System.out.println("I will lend the money");
		} else {
			System.out.println("I will reject a client");
		}
		
	}
}





