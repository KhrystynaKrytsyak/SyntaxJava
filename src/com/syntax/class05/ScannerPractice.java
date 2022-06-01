package com.syntax.class05;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("A driver's license will be issued to you");
		}else {
			System.out.println("Please get your permit first");
		}
	
	}
}
