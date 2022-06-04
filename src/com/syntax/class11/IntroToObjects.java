package com.syntax.class11;

import java.util.Scanner;

public class IntroToObjects {

		// attributes how the object will look like
		String name;
		int age;
		double weight;
		String color;
		double height;
		String breed;
		//how that object behave
		
		void bark() {
			System.out.println("Dog barks");
		}
		void walks() {
			System.out.println("Dog walks");
		}
		void eat () {
			System.out.println("Dogs like to eat bone");
		}
		public static void main (String[] args) {
			Scanner scan=new Scanner (System.in); //press ctrl+click to explore
			scan.next();

			Dog jimmy=new Dog();
			jimmy.name="Jimmy";
			jimmy.age=6;
			jimmy.weight=16;
			jimmy.color="pink";
			jimmy.height=2.6;
			jimmy.breed="German";
			jimmy.bark();
	//new Dog() how we create an object
	scan.close();
		}

}
