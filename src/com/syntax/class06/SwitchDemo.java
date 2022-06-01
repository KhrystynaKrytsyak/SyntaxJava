package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		char choice = 'Y';
		String meaning;
		// variable and matching cases MUST BE of the same type

		switch (choice) {
		case 'Y':
			meaning = "yes";
			break;
		case 'M':
			meaning = "maybe";
			break;
		case 'N':
			meaning = "no";
			break;
		default:
			meaning = "Uknown";
		}
		System.out.println(meaning);
	}
}
