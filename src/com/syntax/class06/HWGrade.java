package com.syntax.class06;

import java.util.Scanner;

public class HWGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		// the end your program should print which grade was entered by a user with
		// explanation.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade;
		grade = scan.nextLine();

		switch (grade) {
		case "A":
			grade = "Excellent";
			break;
		case "B":
			grade = "Good";
			break;
		case "C":
			grade = "Average";
			break;
		case "D":
			grade = "Bad";
			break;
		default:
			grade = "Not Acceptable";
		}
		System.out.println("Your grade is " + grade);

		System.out.println("______________________________________________________________________________________--");
		
		System.out.println("Please enter your grade");
		String YourGrade = scan.next();
		
		if (YourGrade.equals("A")) {
			System.out.println(YourGrade+" is Excellent");
		}else if (YourGrade.equals("B")) {
			System.out.println(YourGrade+" is Good");
		}else if (YourGrade.equals("C")) {
			System.out.println(YourGrade+" is Average");
		}else if (YourGrade.equals("D")) {
			System.out.println(YourGrade+" is Bad");
		}
		else {
			System.out.println(YourGrade+" is not Acceptable");
		}
		System.out.println("Your grade is "+YourGrade);
	}
}
