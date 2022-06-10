package com.syntax.class12;

import java.util.Scanner;

public class StringTask1 {

	public static void main(String[] args) {
		
		//Store username, password and confirm password from a user and check following requirements:
		//Username and Password cannot be empty, if so→ message=”Username and Password cannot be empty”.
		//Password should be minimum 8 characters, if less → message=”Password is too short”.
		//Password cannot contain username if so, → message=”Password cannot contain username”.
		//Password should match confirmed password, if not  → message=“Passwords do not match”.
		//Only after all requirements met → message “Your username and password has been created”

		String userName="admin";
		String password="pass12345";
		String confirmPassword="pass12345";
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your username");
		userName=scanner.nextLine();
		System.out.println("Please enter your password");
		password=scanner.nextLine();
		System.out.println("Please confirm your password");
		confirmPassword=scanner.nextLine();
		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("User name and password cannot be empty");
		} else if (password.length()<8) {
			System.out.println("Password is too short");
		} else if (password.contains(userName)) {
			System.out.println("Password can not contain username");
		} else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}
		
		System.out.println("______________________________________________________________");
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if (password.length()<8) {
			System.out.println("Password is too short");
		}else if (password.contains(userName)) {
			System.out.println("Password cannot contain username");
		}else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
	}
}
