package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		/* i loop iterates over rows
		 * nums.length gives # of arrays inside 2D array =3 
		 * loop iterates over columns
		 */
		
		int[][]nums= {{1,2,3,4,5},
					{199,300,588,700},
					{1900, 4578, 98787}};
			System.out.println("All values using enhanced for loop");
			/*
			 * enhanced for loop uses variables to access elements from an array
			 * outer for loops --> iterates over 1D array
			 * inner loop --> iterates over elements of each 1D array
			 */
		
		for(int[]num:nums) {
			for (int n:num) {
				System.out.print(n+" ");
			
		}
			System.out.println("Retrieve all values using for each loop");
		
		String [][] usa= {
				
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
		};
			
				for (String[]state:usa) {
					for (String city:state) {
						System.out.println(city+" ");
					}
			}
	
		}
	}
}
