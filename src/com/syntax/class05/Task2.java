package com.syntax.class05;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Monday and Friday ---> No Class
		 * Tuesday and Wednesday ----> Manual testing
		 * Thursday ----> Review
		 * Saturday and Sunday----> Java Class
		 */
		
		String day="Saturday";
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have manual testing class");
		}else if (day.equals("Thursday")) {
			System.out.println("I have review day");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have java class");
		}
	}

}
