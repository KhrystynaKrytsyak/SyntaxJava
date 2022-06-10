package com.syntax.reviewclass5;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) {
			System.out.println("Batch 13 is great");
			if(i>2) {
			continue; // it will skip everything thats after continue. 
			//Will only be executed when the loop get executed.
			}
			System.out.println("Batch 13 is excellent"); // this line will never be reachable because of continue; 
		}
	}
}
