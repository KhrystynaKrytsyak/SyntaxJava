package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Quiz Score?");
		double Quiz = scan.nextDouble();
		System.out.println("Mid Term Score?");
		double Term = scan.nextDouble();
		System.out.println("Final Score?");
		double Final = scan.nextDouble();

		double Average = ((Quiz + Term + Final) / 3);
		System.out.println("YOur average score is " + Average);
		char grade; //(when using char use '' single cords for the value)
		if (Average >= 90) {
			grade = 'A';
		} else if (Average >= 70 && Average <= 90) {
			grade = 'B';
		} else if (Average >= 50 && Average <= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
			System.out.println("You are a "+grade+" student");
			
	/* if you are A or B student -----> you are doing great
	 * otherwise ---> please try to study more 
	 */
	 if (grade=='A' && grade=='B') {  // == is used when its anything but string (when string its input.equals)
	 System.out.println("you are doing great");	
	 
	 }else {	
		 System.out.println("you need to study more");
	 }
	
	}
}
