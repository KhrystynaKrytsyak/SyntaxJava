package com.syntax.reviewclass3;

public class EnhancedIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Monday";
		if(day.equals("Monday"));
		System.out.println("weekday");

	if ("Tuesday".equals(day)) {
		System.out.println("weekday");
	}
	if ("Wednesday".equals(day)) {
		System.out.println("weekday");
	}
	if("Thursday".equals(day)) {
		System.out.println("weekday");
	}
	if("Thurday".equals(day)) {
		System.out.println("weekday");
	}
	if("Friday".equals(day)) {
		System.out.println("weekday");
	}
	if("Saturday".equals(day)) {
		System.out.println("weekend");
	}
	if ("Sunday".equals(day)) {
		System.out.println("weekend");
	}
	
	System.out.println("_______________________________________________________________________");
	
	if(day.equals("Monday") || "Tuesday".equals(day) ||
				"Wednesday".equals(day)
				|| "Thursday".equals(day) || "Friday".equals(day)) {
		System.out.println("Weekday");
	}else if ("Saturday".equals(day) || "Sunday".equals(day)) {
		System.out.println("Weekend");
	}else {
		System.out.println("Not a valid day");
	
	}
	}
}