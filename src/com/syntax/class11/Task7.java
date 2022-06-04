package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// 0 1 1 2 3 5 8 13 21
		
		int previousNum=0;
		int currentNum=1;
		int nextNum=0;
		int NumsToPrint=10;
		System.out.print(0+" ");
		System.out.print(1+" ");
		
		for(int i=0; i<NumsToPrint-2; i++) {
			nextNum=previousNum+currentNum;
			System.out.print(nextNum+" ");
			previousNum=currentNum;
			currentNum=nextNum;
		}
	}
}
