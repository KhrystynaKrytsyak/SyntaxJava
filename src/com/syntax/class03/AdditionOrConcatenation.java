package com.syntax.class03;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String c="Hello";
		String d="Hi";
		System.out.println(a+b+c+d); //30HelloHi
		System.out.println(a+c+b+d); //10hello20hi
		System.out.println(c+d+a+b); //HelloHi1020  //because there is string first the rest is concatenation 
		System.out.println(c+d+(a+b));
	}

}
