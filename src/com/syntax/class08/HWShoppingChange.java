package com.syntax.class08;
import java.util.Scanner;
public class HWShoppingChange {
	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want to buy and the price of
		// that item. 
		//Every time user enters money, accumulate the amount and tell the
		// user how much is left to pay off. If user give more money program should
		// return a change. Whenever a user done with payments program should say “Thank
		// you for shopping!”
		Scanner scan = new Scanner(System.in);
		System.out.println("Scan item you want to buy");
		String item=scan.nextLine();
		System.out.println("Enter the price of this item");
		double price=scan.nextDouble();
		System.out.println("Please insert your bills");
		double bills=scan.nextDouble();
		double moneyOwed=price-bills;
		double change=bills-price;
	
		if (price>bills) {
			System.out.println("You still owe "+moneyOwed);
			moneyOwed=scan.nextDouble();
			
		}while (price<bills) {
			System.out.println("Your change is "+change);
			break;
		}
		System.out.println("Thank you for shopping");
	}
}
