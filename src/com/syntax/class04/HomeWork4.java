package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your first name");

		String name=input.next();
		System.out.println(name+" please enter your Last Name");
		
		String lastName=input.next();
		System.out.println(name+" "+lastName+" please enter your state");
		
		String state=input.next();
		System.out.println(state);
		

	}

}
