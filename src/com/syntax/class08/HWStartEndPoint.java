package com.syntax.class08;

import java.util.Scanner;

public class HWStartEndPoint {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your start point integer");
		int start=scan.nextInt();
		System.out.println("Enter your end point integer");
		int end=scan.nextInt();
		
		int sumEven=0; int sumOdd=0;
		
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}	
	
		System.out.println("The sum of even integers in a range is "+sumEven);
		System.out.println("The sum of Odd integers in a range is "+sumOdd);	
	}
}
