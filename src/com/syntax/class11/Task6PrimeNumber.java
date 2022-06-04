package com.syntax.class11;

public abstract class Task6PrimeNumber {

	public static void main(String[] args) {
		// write a java program to check whether a given number is prime or not?
		
		int x=20;
		boolean isPrime=true;
		if(x>1) {
			for(int i=2; i<x; i++) {
				if(x%i==0) {  //if # that user has provided if that # is completely divisible by any other number
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println(x+" is Prime ");
		}else {
			System.out.println(x+" is not Prime ");
		}

	}

}

