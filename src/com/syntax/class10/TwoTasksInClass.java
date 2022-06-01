package com.syntax.class10;

import java.lang.reflect.Array;

public class TwoTasksInClass {

	public static void main(String[] args) {
		// Task 1 : From an array of integer elements find the largest number.

		int[] numbers = { 10, 16, 2, 78, 45, 3, 90 };
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The largest element is " + max);
	// Using Enhanced Loop	
		max=numbers[0];
		for(int num:numbers) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println("The largest element is "+max);

		// Task 2 : Create an array to store char values and then print those in reverse
		// order
		
		char[] values = {'a', 'b', 'c', 'd'}; 
		for (int i = values.length - 1; i>=0; i--) {
			System.out.println(values[i] + " ");
		}

	}
	// Enhanced loop cannot do reverse order only forward;

}
