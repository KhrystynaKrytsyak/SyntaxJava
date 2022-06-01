package com.syntax.class04;

import java.util.Scanner;

public class homework4Task2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Choose a value from 0-100?");
		
		int value=input.nextInt();
		System.out.println("The value you chose is "+value);
		
		System.out.println("Choose another value from 100-200?");
		
		int value2= input.nextInt();
		System.out.println("The value you chose is "+value2);
		
		if (value>value2) {
			System.out.println(value+" is larger than value2");
		}else {
			System.out.println(value2+" is larger");
		}
	}

}
