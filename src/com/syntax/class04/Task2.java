package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		
		boolean diploma=true; // false will give you "get a degree" outcome
		double gpaScore=3.1;
		
		if (diploma) {
			System.out.println("Congratulations");
			
		if(gpaScore>=3.5) {
			System.out.println("You are eligible for scholarship");
		}else  {
			System.out.println("You should have studied harder");
		}
		
		}else {
			System.out.println("Get a degree");
		}

		System.out.println("____________________________________________________________________");
		
		double mortgageRate= 3.5;
		int mortgagePrice= 45000;
		if(mortgageRate>4.5) {
			System.out.println("User will not buy a house");
		if(mortgagePrice>50000) {
			System.out.println("User will take a loan");
		}else {
			System.out.println("User will pay cash");
		}
		}else {
			System.out.println("User will consider buying a house");	
	}
	}
}
