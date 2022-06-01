package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * lets ask a user where is he from based on the country we will define his
		 * favorite assignment
		 */
		Scanner scan = new Scanner(System.in);
		String country, favoriteFood;
		System.out.println("Please tell me where are you from?");
		country = scan.nextLine(); // here you don't need String country because its a duplicate variable so just
									// use country
		switch (country.toLowerCase()) {
		case "mexico":
			favoriteFood = "tacos";
			break;
		case "canada":
			favoriteFood = "poutine";
			break;
		case "turkey":
			favoriteFood = "lahmacun";
			break;
		case "pakistan":
			favoriteFood = "pati chai";
			break;
		case "egypt":
			favoriteFood = "koshary";
			break;
		case "usa":
			favoriteFood = "Burgers";
			break;
		default:
			favoriteFood = "Unknown";
		}
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);

	}

}
