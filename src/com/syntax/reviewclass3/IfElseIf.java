package com.syntax.reviewclass3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// when code executes but does not produce expected results we call these mistakes logical errors
		//when code does not even executes we call these mistakes syntax errors
		
		String day = "Monday"; //in non primitive type variables we can store null which means nothing
		if (day.equals("Monday")) {
			System.out.println("weekday");
		} else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		} else if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Wednesday".equals(day)) {
			System.out.println("weekday");
		}else if ("Thurday".equals(day)) {
		System.out.println("weekday");
		}else if ("Friday".equals(day)) {
			System.out.println("weekday");
		}else if ("Saturday".equals(day)) {
			System.out.println("weekend");
		}else if ("Sunday".equals(day)) {
			System.out.println("weekend");
		}
	System.out.println("__________________________________________________________________________________________");
	
	
	
	}
}
