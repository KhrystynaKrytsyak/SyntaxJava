package com.syntax.class07;

public class WhileLoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		int x = 100;
		while (x >= 1) {
			System.out.print(x + " ");
			x--;
	}
		System.out.println();
		int e = 20;
		while (e <= 100) {
			System.out.print(e + " ");
			e += 2;
		}
		//print only odd numbers from 100 to 1
		System.out.println();
		int r=100;
		while (r>=1) {
			if (r%2!=0) {
				System.out.print(r+" ");
			}
			r--;
		}
		//another way
		System.out.println();
		int y=99;
		while (y>=1) {
			System.out.print(y+" ");
			y-=2;
		}
		
		System.out.println();
		int num=1;
		while (num<=3) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println("_____________________________________");
		
		//do while first executes the code
		// and only then checks the condition
		int num1= 1;
		 do {
			 System.out.print(num1+" ");
			 num1++;
		 }while (num1<=3);
		 	
		 System.out.println();
		 //print numbers 1 to 30 using do while
		 int number=1;
				 do {
					 System.out.print(number+" ");
					 number++;
				 }while (num1<=30);
		 System.out.println(number);
		}
	}

