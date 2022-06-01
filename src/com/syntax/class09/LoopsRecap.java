package com.syntax.class09;

public class LoopsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// "For" loops are used when we know how many iterations we go for in a for loop.
// "while" loop is used when we dont know how many times we want to execute the code.	
// break - keyword that breaks the loop {};
//continue - keyword that skips current execution/iteration;
// Nested loop - loops inside another loop;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");

			for (int y = 1; y >= 3; y--) { // condition is false y>=3 so there will 
											//be no output for inner loop
			
				System.out.println("Bye");
			}
		}
		System.out.println("_____________________________________________________");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");

			for (int y = 1; y<= 3; y++) { 
				
			System.out.println("bye");
			continue;
			}
		}
	}
}
