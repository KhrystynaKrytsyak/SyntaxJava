package com.syntax.class05;

import java.util.Scanner;

public class TaskWeekendOrWeekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the day of the week today? Enter the number");
		int day = scan.nextInt();
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("Is it a weekend");
		} else {
			System.out.println("Invaid day");
		}
	}
}
