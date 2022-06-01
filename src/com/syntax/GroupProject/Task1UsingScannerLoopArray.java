package com.syntax.GroupProject;

import java.util.Scanner;

public class Task1UsingScannerLoopArray {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an array is created,
		// retrieve all values from it and while retrieving those values print capital
		// for each country. (use 2 different loops).
	//Loop 1	
		Scanner scan=new Scanner(System.in);
		String[] country= {"Turkey", "Ukraine", "USA", "France", "Spain", "India"};
		String[] capital= {"Ankara", "Kiev", "DC", "Paris", "Madrid", "New Delhi"};
		for (int i=0; i<country.length; i++) {
			System.out.print("The capital of "+country[i]+" is ");
			System.out.print(capital[i]);
			System.out.println();
		}
			System.out.println("_____________________________________________________________________________");
			
			 
		
	}
}
