package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1; i<6; i++) {   //1<6 the value is True then it goes to sum to reassign
			
			sum+=i;  // this line means reassigning "sum=sum+1" so 0=0+1 in our case//then the value is incremented 
		}		
		System.out.println(sum+" ");//1 3 6 10 15

	}
}
