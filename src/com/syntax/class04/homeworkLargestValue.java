package com.syntax.class04;

public class homeworkLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=33;
		int num2=16;
		int num3=8;
		
		if(num1>num2 && num1>num3) {  //&& is logical operator  
			System.out.println("The largest number is "+num1);
		}else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}else {
			System.out.println("The largest number is "+num3);
		}
		
		System.out.println("________________________________________________________________________________________-");
		
		int num4=65;
		int num5=66;
		int num6=23;
		
		if(num4>=num5) {
			if (num4>=num6) {
				System.out.println(num4+" is largest number");
			}else {
				System.out.println(num6+" is largest number");
			}
		}else { //otherwise num2>num1
			if (num5>=num6) {
				System.out.println(num2+" is largest number");
			}else { //num6>num5
				System.out.println(num6+"is largest number");
			}
		}
	}

}
