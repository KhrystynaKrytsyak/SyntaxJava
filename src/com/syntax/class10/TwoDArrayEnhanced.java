package com.syntax.class10;

public class TwoDArrayEnhanced {

	public static void main(String[] args) {
		/* create 2d array of states
		 * 
		 * 1 array---> NY --->all cities of NY State
		 * 2 array---> CA --->all cities of CA State
		 * 3 array--->FL ---->all cities of FL State
		 * 4 array--->VA ---->all cities of VA State
		 */
		
		String [][] usa= {
				
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
		};
		System.out.println(usa[1][2]); //San Jose
		System.out.println(usa[2][0]); //Miami
		
		System.out.println("Total# of 1D arrays in array usa ="=usa.length); //4
		//I want to see how many elements inside my 1st array
		int elements1array=usa[0].length;
		System.out.println("# of elements in 1 array = "+elements1array);
		//I want to see how many elements inside my 2nd array
		int elements2array=usa[1].length;
		System.out.println("# of elements in 2 array = "+elements2array);
	}

}
