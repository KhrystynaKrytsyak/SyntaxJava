package com.syntax.class08;

public class NestedLoopIntro {
	public static void main (String [] args) {
		for (int i=1; i<=3; i++) { //outer loops
			System.out.println("Hello");
			
			for (int y=1; y<=2; y++) //nested loop
		System.out.println("Bye");
		}
	}
}
