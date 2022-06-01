package com.syntax.class09;

public class ArrayTask {

	public static void main(String[] args) {
		// create an array of chars and store grades into it: A,B,C,D,E,F. Print B. use 2 ways;
		
		//1 way
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);

	System.out.println("__________________________________________________________________________________________-");
	//2 way
	char Grade[]= {'A', 'B', 'C', 'D', 'E', 'F'};

	for (int i=0; i<grade.length; i++) {
		System.out.print(Grade[i]+" ");
	}
	
	
	System.out.println();
	String [] words= {"Java", "Saturday", "day"};
	//I want to retrieve all elements
	for (int i=0; i<=words.length; i++) {
		System.out.println(words[i]+" ");
	}
	System.out.println("The end");
	}
}
