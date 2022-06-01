package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		String name="Oleg";
		String lastName="Smith";
		
		long phone=1234567890l;
		
		//xxx-xxx-xxxx
		String phoneNumber="123-456-7890";
		String address="123 Washington street";
		
		String age ="30";
		String city= "Miami";
		
		//shortcut for printing
		//syso +ctrl +space ---> hit enter
		
		/* we can use +
		 * 					to attach String to String
		 */
		System.out.println(name+" "+lastName);//Oleg Smith
		
		//Oleg lives in Miami
		System.out.println(name+" lives in "+city);
		
		//Oleg is 30 years old
	System.out.println(name+ " is "+age+" years old.");

	/*
	 * Rules for identifiers
	 * 1. no space
	 * 2. no keywords
	 * 3. cannot start with numbers (but number can be used after the letter)
	 * 4. cannot have with special character (except _, $)
	 */
	
	//String break="Hello";
	//int 1number=10;
	
	int number1=10;
	
	//int num%=20; error
	double $price=3.99;
	float f=2.09f;
	
	/*
	 * Naming Conventions
	 * follow came casing
	 * variable names should start with the lower case and then follow came casing
	 * class names should start with uppercase
	 */
	
		String MyCity="Tysons";
	

	}

}
