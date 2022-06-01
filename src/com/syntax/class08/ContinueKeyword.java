package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {

		// continue keyword - skips current execution/iteration

		for (int i = 1; i <= 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.print(i + " "); // 1,3,4,5 will be executed because the if condition is true and therefore it
										// doesn't execute it
			System.out.println("Hello");
			System.out.println("We are going on break soon");
		}
		//print numbers from 1 to 10 except number 5 and 7
		for (int i=1; i<=10; i++) {
			if (i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
