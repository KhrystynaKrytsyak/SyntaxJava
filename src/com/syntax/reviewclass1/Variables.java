package com.syntax.reviewclass1;

import java.math.BigInteger;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="10";
		String b="20";
		//System.out.println(a*b);
		//Boxes to store numbers without decimal places
		byte smallestBox=127; //-128 to 127
		short slightlyLargeBox=16665; //-32768-32767
		int famousBox=21312324; //most of the time will be used to store numbers
		long notThatFamous=934593485095083058L;
		BigInteger i=new BigInteger("122222222222222222224444444444444444444444444");
		
		float f=12.555555555777777f;
		double d=12.345465335555555;
		System.out.println(f);
		System.out.println(d);
		
		float f1=10.0f/3.0f;
		double d1=10.0/3.0;
		System.out.println(f1);
		System.out.println(d1);
		
		char l='a';
		System.out.println("l");
		String name="Khrystyna";
		String adress="house #5, Flat #3, street 121 ";
		
		boolean areYouHungry=true;
		
		
				
		//always for whole numbers use int data type and for decimal numbers use double 
	}

}
  