package com.syntax.reviewclass6;

public class Student {

		// TODO Auto-generated method stub
		//define attributes/fields=variables;
		String name, lastName, address;
		int studentId, age;
		char grade; 
		//define behavior = methods
		
		void study() {
			System.out.println(name+" student is studying");
		}
		void doHomework() { 
			System.out.println(name+" Student is doing homework");
		}
		//create a method that will return full name of a student in upper case
		
				String getFullName() {
				return(name+" "+lastName).toUpperCase();
				System.out.println("return(getFullName));
	}
}


