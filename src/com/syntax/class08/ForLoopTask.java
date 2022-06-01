package com.syntax.class08;

public class ForLoopTask {

	public static void main(String[] args) {
//print numbers from 1 to 100 in 1 line with space
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
//print numbers from 100 to 1 
		System.out.println();

		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
//print even number from 20 to 1 (2 ways)

		for (int i = 20; i >= 0; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int m=20; m>=1; m--) {
			if (m%2==0) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
//print out odd numbers from 20 to 50 (2 ways) using for loop && if condition
//1st way		
		for (int i=19; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
//2nd way		
		for (int m=19; m<=50; m++) {
			if (m%2 !=0) {
				System.out.print(m+" ");
			}
		}
	}

}
