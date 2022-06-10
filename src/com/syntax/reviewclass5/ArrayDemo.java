package com.syntax.reviewclass5;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shoould create an array
		String name="Oleg";
		String name2="King";
		String name3="Mumtaz";
		
		//should not create an array
		String city="New York";
		String country="USA";
		String continent="America";
		
		// only used 5% of the time
		String [] names= {"Oleg", "King", "Mumtaz"};
		
		
		//this method used 95% of the time
		String [] name2=new String[3]; //creates an empty array
		name2 [0] = "Oleg";  //stores Oleg on first position
		name2 [1] = "King";
		name2 [2] = "Mumtaz";
				
	}

}
