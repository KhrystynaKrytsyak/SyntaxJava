package com.syntax.class05;

import java.util.Scanner;

public class TaskUsingIfAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter height in inches");
		int height= input.nextInt();
		
		if (height<60) {
			System.out.println("The person is short");
		}else if (height>=60 && height<=72) {
			System.out.println("The person is medium");
		}else if (height>72) {
			System.out.println("The person is tall");
		}
}
}