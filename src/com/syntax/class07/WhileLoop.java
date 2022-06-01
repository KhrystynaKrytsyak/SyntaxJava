package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		int time=10; //if its 13 and bigger the block will not execute in neither if nor while statement
		if (time<12) {
			System.out.println("Morning");
		}
		
		System.out.println("_______________________________________________________________-");
		
		while(time<12) {
			System.out.println("Morning"); // infinite
			time++; // it increments by 1
		}
		
		System.out.println("Hello");
		
		

	}

}
