package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using scanner class create calculator. Allow user to enter 2 numbers and
		// operator(+,-,*,/). Based on operator provide the result to user.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = scan.nextInt();

		System.out.println("Please enter second number");
		int num2 = scan.nextInt();

		System.out.println("Please enter an operator");
		String operator;

		operator = scan.next();
		if (operator.equals("+")) {
			System.out.println(num1 + num2);
		} else if (operator.equals("-")) {
			System.out.println(num1 - num2);
		} else if (operator.equals("*")) {
			System.out.println(num1 * num2);
		} else if (operator.equals("/")) {
			System.out.println(num1 / num2);
		}

		// Switch method:
		System.out.println("Please enter first number");
		double num3 = scan.nextDouble();
		System.out.println("Please enter second number");
		double num4 = scan.nextDouble();
		System.out.println("Please enter an operator");
		char oper=scan.next().charAt(0); // we put 0 for char so it can capture its first number
		double result=0; //compiler will do implicit casting meaning that they
						//will add that 0 first of all(compiler needs a value to start)

		switch (oper) {
		case '+':
			result = (num3 + num4);
			break;
		case '-':
			result = (num3 - num4);
			break;
		case '*':
			result = (num3 * num4);
			break;
		case '/':
			result = (num3 / num4);
			break;
			default:
				System.out.println("Invalid Operator");
		}
		System.out.println("Your result is "+result);
	}
}
