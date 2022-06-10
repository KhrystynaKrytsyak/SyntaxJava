package com.syntax.class14;

import java.util.Scanner;

public class methodsDemo {
	//method is a block of code a group of java statements that are grouped together and
	//we can execute those statements by just creating an object of the class that contains
	//that method and by writing the object name .method name
 
	void printHello() {
		System.out.println("How are you guys");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsDemo md=new methodsDemo();
		md.printHello();
		
		Scanner scanner=new Scanner(System.in);
		scanner.nextLine();

	}

}
