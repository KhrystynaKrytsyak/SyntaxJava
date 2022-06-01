package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth month");
		String month = input.next();
		
		String season;
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season="Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season="Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season="Autumn";
		} else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			season="Winter";
		}else {
			season="Invalid";
		}
		if (!season.equals("Invalid")) {
		System.out.println("You were born in "+ season);
	}
}
}
