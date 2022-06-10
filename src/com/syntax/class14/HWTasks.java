package com.syntax.class14;

public class HWTasks {
	public static void main(String[] args) {

		// Create a String that
		// will hold a sentence. Write a program to get a new
		// String without any spaces.
//Task #1
		String str = "Olegs building is on fire";
		System.out.println(str.replace(" ", "")); // removes spaces within the sentence vs trim removes spaces in the
//Task #2												// beginning or end of sentence

		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many Alphanumeric characters are there in the String
		String str2 = "ddjsflkdjfslkjfs1231!@#$";
		System.out.println(str2.replaceAll("[A-Za-z0-9]", "").length());
//Task #3
		// You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class
		// today?” How would you find out how many sentences are in that String?
		String str3="Is it saturday? Is it raining? Do we have a Java Class today?";
		System.out.println(str3.split("[?]").length); // you can also specify using [?.!]
//Task #4
		//How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		
		String str4="This is sentence i want to reverse";
		String[] arr=str.split(" ");
		
		for (String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		System.out.println();
		System.out.println(new StringBuilder(str).reverse());
	}
}
