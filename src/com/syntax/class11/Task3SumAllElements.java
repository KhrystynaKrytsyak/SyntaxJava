package com.syntax.class11;

public class Task3SumAllElements {

	public static void main(String[] args) {
		// create 2D array of integer values
		//Print the sum of all numbers
		
		int[][] array= {{10,15,10},
						{20, 50, 20},
						{30, 30, 30}};
		
	for(int j=0; j<array.length; j++) {
	for (int i=0; i<array[j].length; i++) {
		if (array[j][i]%2==0) {
			System.out.println(array[j][i]);
		}	
	}
}
	}
}
