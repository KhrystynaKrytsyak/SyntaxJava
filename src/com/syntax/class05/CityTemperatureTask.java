package com.syntax.class05;

import java.util.Scanner;

public class CityTemperatureTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your city");
		String city = input.nextLine();
		
		System.out.println("Please enter temperature");
		int fah=input.nextInt();
		
		int celsius=5*(fah-32)/9;
		System.out.println("The temperature in " + city + " is " + celsius);
		}
	}

