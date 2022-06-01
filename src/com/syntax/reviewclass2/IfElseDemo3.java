package com.syntax.reviewclass2;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in); // allows to take the input from the keyboard
		System.out.println("Please Enter your Account balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend=scanner.nextDouble();
		
		if(accountBalance>=amountToLend) {
			System.out.println("Yes I can help you");
		}else {
			System.out.println("Sorry I don't have enough money to help you");
		}
	}

}
