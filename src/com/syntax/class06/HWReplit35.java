package com.syntax.class06;

import java.util.Scanner;

public class HWReplit35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan");
		Boolean loan = scan.nextBoolean();
		loan = true;
		if (loan) {
			System.out.println("What is your credit score?");
			int creditScore = scan.nextInt();
			if (creditScore < 600) {
				System.out.println("Not eligible");
			} else if (creditScore >= 600 && creditScore <= 700) {
				System.out.println("Maybe eligible");

			} else if (creditScore >= 701 && creditScore <= 800) {
				System.out.println("Eligible");
			} else if (creditScore > 800) {
				System.out.println("Definitely eligible");
			} else {
				System.out.println("Not eligible");
			}

		}
	}
}
