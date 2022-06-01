package com.syntax.class05;

import java.util.Scanner;

public class AverageGradetask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program that will read three inputs of averages (quiz, mid term, and final averages)
//and determine the grade based on the following rules:
//if the average average >=90 → grade=A
//if the average average >= 70 and <90 → grade=B
//if the average average>=50 and <70 → grade=C
//if the average average<50 → grade=F

		Scanner input=new Scanner (System.in);
		System.out.println("Please enter your quiz score");
		int score1=input.nextInt();
		System.out.println("Please enter your mid-term score");
		int score2=input.nextInt();
		System.out.println("Please enter your final score");
		int score3=input.nextInt();
		
		int average=(score1+score2+score3)/3;
		
		if(average>=90) {
			System.out.println("grade=A");
		}else if (average>=70 || average<90) {
			System.out.println("grade=B");
		}else if (average>=50 || average<70) {
			System.out.println("grade=C");
		}else if (average<50) {
			System.out.println("grade=F");
		}
	}
}
