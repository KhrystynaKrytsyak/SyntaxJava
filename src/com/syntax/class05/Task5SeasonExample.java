package com.syntax.class05;

import java.util.Scanner;

public class Task5SeasonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Write a program for user to enter his/hers birth month. Based on the month define the season.
//Example: if user is born in March, April, May → season =“Spring”
//	if user is born in June, July, August →
//season =“Summer” etc …
//At the end of the program we should see output as “You were born is season ______“.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month = input.next();

		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("It is spring season");
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("It is summer season");
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("It is fall season");
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			System.out.println("It is winter season");
		}
	}
}
