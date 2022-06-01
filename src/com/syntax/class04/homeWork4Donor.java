package com.syntax.class04;

public class homeWork4Donor {
		
	public static void main (String[] args) {
		
		int donorAge=21;
		int donorWeight=115;
		
		if(donorAge>=18) {
			System.out.println("You are eligible to donate");
		if (donorWeight>110) {
		System.out.println("You are eligible");
		}else {
			System.out.println("You do not weight enough");
		}
		}else {
			System.out.println("You are NOT eligible");
			
		}
	
	}
}
