package com.syntax.class13;

public class Task2HW {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).
		// Write a program that reads two people's first
		// names and if they expecting boy or girl?
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom's first name? Mary
		// Dad's first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY
		
		String str="Sunday";
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
