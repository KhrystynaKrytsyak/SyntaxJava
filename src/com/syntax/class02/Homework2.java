package com.syntax.class02;

public class Homework2 {

	public static void main(String[] args) {
		float a=10.65f;
		float b=2.98f;
		float sum, sub, mult, div;
		sum=a+b;
		sub=a-b;
		mult=a*b;
		div=a/b;
		
		System.out.println("The summation of 2 numbers "+a+" and "+b+" is equals to "+sum);
		System.out.println("The subtraction of 2 numbers "+a+" and "+b+" is equals to "+sub);
		System.out.println("The multiplication of 2 numbers "+a+" and "+b+" is equals to "+mult);
		System.out.println("The division of 2 numbers "+a+" and "+b+" is equals to "+div);
	
		
	//* Task2
		
		float c=3.9f;
		float square=c*c;
	
		mult=c*c;
		System.out.println("The square of "+c+" is "+square);
	
	//* Task3
		int area; 
		int perimeter;
		int width=5;
		int height=8;
		
		area=width*height;
		perimeter=width+height+width+height;
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+
				" is equals to "+perimeter+" and the area is "+area);
			 	
		
	}

}
