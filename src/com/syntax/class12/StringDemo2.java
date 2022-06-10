package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Adem";
		String lastName=" Jones";
		String fullName=firstName+lastName;
		String fullName2=firstName.concat(lastName);
		System.out.println(fullName2);
		System.out.println(fullName);
	
		String name=" "; 
		System.out.println(name.isEmpty()); //false if there is name OR space. True is empty with no spacing
		System.out.println(name.isBlank());
		
		String str=" never ";
		System.out.println(str.trim());
	
	}

}
