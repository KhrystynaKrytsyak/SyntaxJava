package com.syntax.reviewclass3;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the name of the country");
		String country=scan.nextLine();
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
			capital="Either a country is incorrect or it doesnt exist";
		}
				System.out.println(capital);
	}
		
	}
