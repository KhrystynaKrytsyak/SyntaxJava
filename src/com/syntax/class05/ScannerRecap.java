package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter name");
		String name=scan.next(); //capture String //use next for one word //use nextLine if there are two names
		System.out.println(name);
		
		System.out.println("Please enter age");
		int age=scan.nextInt(); //capture int
		System.out.println(age);
		
		System.out.println("Please enter price");
		double price=scan.nextDouble(); //capture double
		System.out.println(price);
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean(); //capture boolean
		System.out.println(boo);
		
		System.out.println("Please enter any character");
		char character=scan.next().charAt(0); //capture 1 character
		System.out.println(character);
		
		System.out.println("_____________________________________________________________________");
		
	}

}
