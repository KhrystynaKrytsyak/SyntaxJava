package com.syntax.reviewclass3;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String country= "Turkey";
		String capital;
		switch(country) {
		
		case "Turkey":
			capital="Ankara";
			break;
		case "USA":
			capital="DC";
			break;
		case "Serbia":
			capital="Belgrade";
			break;
		case "Albania":
			capital= "Tirana";
			break;
		case "Afghanistan":
			capital="Kabul";
			break;
		case "Pakistan":
			capital= "Islamabad";
			break;
			default:
			capital= "Either country name is incorrect or it doesnt exist";
		}
				System.out.println(capital);
	}
}


