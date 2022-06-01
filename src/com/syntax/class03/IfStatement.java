package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
	
		/*
		 * declare a variable rate.
		 * If rate is more than 5 ---> I am not buying the house
		 */
		double mortgageRate=4.5;
		if (mortgageRate>5); {
			
		
		System.out.println("I am not buying a house");
		}
		
		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */
	int num1=99;
	int num2=10;
	
	if(num1>num2); {
		
		System.out.println(num1+" is bigger than "+num2); //if you change the num2=100 the output will not change 
		
	}
	
	/*
	 * declare temperature
	 * if temperature is higher than 75 --/ i will go on a walk
	 */
		int temp=68;
		
		if (temp>75) {   // code goes inside if {}
			             // when condition is true
			
			System.out.println("I will go for a walk");
		} else {  // otherwise. code comes to else {}
				// when condition is false 
			System.out.println("I am going to study Java");
		}
				
		System.out.println("--------------------------------------------------------------");
		
		char gender='f'; //we usually change values here 
		 if(gender=='f') {  //condition we usually not try to change
			 System.out.println("You like shopping");
			 
		 }else {
			 System.out.println("You like wwatching sports");
		 }
		
		 System.out.println("_____________________________________________________________________________");
		 
		 String browser="chrome"; //anything you put in double cords matters "its CASE SENSETIVE"
		 
		 if (browser.equals("chrome")) { //by puttin "if" it tells a cimputer to check the condition
			 System.out.println("All test cases will be executed on chrome");
		 }else {
			 System.out.println("I am not executing any test cases");
			 System.out.println("Reason- wrong browser");
			 
		
		 }
		 
		
		
		
		
		
		
	}

}
