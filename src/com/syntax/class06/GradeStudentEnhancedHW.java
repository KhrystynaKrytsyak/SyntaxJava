package com.syntax.class06;

import java.util.Scanner;

public class GradeStudentEnhancedHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner (System.in);
		System.out.println("Quiz Score?");
		double Quiz=scan.nextDouble();
		System.out.println("Mid Term Score?");
		double Term=scan.nextDouble();
		System.out.println("Final Score?");
		double Final=scan.nextDouble();
		
		double Average=((Quiz+Term+Final)/3);
		
		if(Average>=90) {
			System.out.println("Your grade is A");
			
		}else if(Average>=70&&Average<90) {
			System.out.println("Your grade is B");
			
		}else if(Average>=50&&Average<70) {
			System.out.println("Your grade is C");
			
		}else if(Average<50){
			System.out.println("Your grade is F");
		}
		
		/* if you are A or B student ----> you are doing great
		 * otherwise ----> please try to study with me 
		 */
		
		
		
	}
}
