package com.syntax.class06;

import java.util.Scanner;

public class HWCountryAndLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TASK: Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		Scanner scan = new Scanner(System.in);
		String country, language;
		System.out.println("Which country are you from?");
		country = scan.nextLine();

		switch (country) {
		case "Ukraine":
			language = "Ukrainian";
			break;
		case "Brazil":
			language = "Portugese";
			break;
		case "Iran":
			language = "Persian";
			break;
		case "South Africa":
			language = "Afrikaans";
			break;
		case "Albania":
			language = "Albanian";
			break;
		default:
			language = "Unknown";
		}
		System.out.println("You are from " + country + " and you speak " + language);

		System.out.println("_________________________________________________________________________________");

		System.out.println("Where are you from?");
		String Country = scan.next();
		if (Country.equals("Ukraine")) {
			System.out.println("You speak Ukrainian");
		} else if (Country.equals("Albania")) {
			System.out.println("You speak Albanian");
		} else if (Country.equals("Greece")) {
			System.out.println("You speak Greek");
		} else if (country.equals("USA")) {
			System.out.println("You speak English");
		}else {
			System.out.println("Your language is unknown");
		}
	}
}
