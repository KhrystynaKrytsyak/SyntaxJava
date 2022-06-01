package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
	/*
	 * if (boolean expression) { //outer if
	 * code A;
	 * if (boolean expression) { // nested/inner
	 * code B;
	 * }
	 * NESTED IF is used when there's further check (list of things)
	 * nested if is also used when one condition depends on another
	 * 
	 */
		boolean vaccine=true; //if true there will be outcome, if false there will be no outcome
		int dose=1;
		
		if(vaccine) {
			System.out.println("How many doses you have?");
			if (dose==1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		System.out.println("___________________________________________________________________");
		
		String month="June"; // if we change the value to  June the condition will not execute
		
		int day=19;
		if(month.equals("May")) {
			System.out.println("Let me check what is today's date");
			if (day==8) {
				System.out.println("Today is Mother's Day");
			}
		}else if (month.equals("June")) {
			if (day==19) {
			System.out.println("Today is Father's Day");
		}
			
		}
	}
}
	
