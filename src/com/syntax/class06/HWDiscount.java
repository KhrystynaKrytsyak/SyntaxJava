package com.syntax.class06;

import java.util.Scanner;

public class HWDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to ask user to enter value for sale: yes or no if there is no
		 * sale --> you are not going for shopping if there is sale ask user which item
		 * they want to buy and it’s price Based on the price you have to calculate the
		 * price of the item after the discount, discount rule: if price is less than
		 * $20 --> apply 10% if price is between $20 & $100 --> 20% if price between
		 * $100 & $500 --> 30% otherwise apply 50% discount After discount ___ the price
		 * of the item reduce from __ to ___
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale?");
		String sale = scan.next();

		if (sale.equals("yes")) {
			System.out.println("What items do you want to buy?");
			String item = scan.next();
			System.out.println("How much do they cost?");
			int price = scan.nextInt();
			if (price > 20) {
				System.out.println("After discount of 10% the price of the item reduce from "+price+" to "+price*(.90)); //price-price*.1
			} else if (price >= 20 && price <= 100) {
				System.out.println("After discount of 10% the price of the item reduce from "+price+" to "+price*(.80));
			} else if (price >= 100 && price <= 500) {
				System.out.println("After discount of 10% the price of the item reduce from "+price+" to "+price*(.70));
			} else {
				System.out.println("After discount of 10% the price of the item reduce from "+price+" to "+price*(.50));
			}
		} else {
			System.out.println("You are not going shopping");  //relational operators cannot be used in switch method
		}
	}
}
