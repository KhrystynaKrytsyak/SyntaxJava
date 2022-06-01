package com.syntax.class05;

import java.util.Scanner;

public class Task3WorkedYearsSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task#3: Write a program to ask user to enter numbers of worked years and
		// annual salary.
		// If user worked for more or equals to 5 years than user is eligible for the
		// bonus, otherwise he is not.
		// once user is eligible and salary is larger than 50000 than bonus = 5000,
		// otherwise bonus=3000.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers of worked years");
		int years = input.nextInt();

		System.out.println("Enter your annual salary");
		int salary = input.nextInt();
		if (years >= 5) {
			System.out.println("User is eligible for the bonus");
			if (salary > 50000) {
				System.out.println("The bonus is 5000");
			} else {
				System.out.println("The bonus is 3000");
			}
		} else {
			System.out.println("NOT eligible for the bonus");
		}
	}

}
