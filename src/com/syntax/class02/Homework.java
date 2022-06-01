package com.syntax.class02;

public class Homework {

	public static void main(String[] args) {
		//whole number
		/*
		 * box1 - is a variable
		 * to create a variable we need 2 things: data type & name
		 */
		
		byte box1 = 127; 
		short box2 = 2345;
		int box3 = 235255; //mostly will be used
		long box4 = 32424532455432L;
		//decimal values
		float container=1.99F;
		double container2=89.99;
		//to represent 1 character
		char gender='m';
		char dollar='$';
		//to represent true or false (yes or no)
		 boolean hungry=true;
		 boolean sleepy=false;
		 
		 //how to access values from variables?
		 //do not use double "" to access variables
		 //access and print values from all variables
		 
		 System.out.println(box1); //calling a variable box1
		 System.out.println(box2);
		 System.out.println(box3);
		 System.out.println(box4);
		 System.out.println(container);
		 System.out.println(container2);
		 System.out.println(gender);
		 System.out.println(dollar);
		 System.out.println(hungry);
		 System.out.println(sleepy); //false
		 System.out.println("sleepy");//sleepy
		 
		 //System.out.println(box5); This line will give error because 
		 int box5=900;
		 System.out.println(box5);
		 
		 int year=2022; // create a variable and store value
		 System.out.println(year);
		 
		 year =2023; //reassigning the value of the same box
		 
		 System.out.println(year); //at one time one variable can see only one value // 2023
	}
}
