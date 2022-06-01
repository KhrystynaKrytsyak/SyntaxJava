package com.syntax.reviewclass3;

public class IfElse {

	public static void main(String[] args) {

		
		String user = "Asghar";
		String password = "pass123";
		// whenever we use primitive data types like
		// byte,short,int,long,boolean,float,double,char
		// we use ==
		// whenever we use not primitive data types we use .equals method
		if (user.equals("asghar") && password.equals("pass123")) {
			System.out.println("Welcome back to Syntax");
		} else {
			System.out.println("username or password is not correct");
		}
		//when debugging make sure:
		//you have not disabled the breakpoints
		//you have not enabled the skip all breakpoints option in debug window
	}

}
