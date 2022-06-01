package com.syntax.class10;

public class TwoDimentionalArrayDemo {

	public static void main(String[] args) {
		// [][] - is to identify its a TwoDimentionArray
		
		//to create 2D array we specify # of rows and columns = size
		int [][] numbers = new int[3][4]; //3,4 may vary it represents ROWs x Columns
		numbers [0][0]=10;
		numbers [0][1]=20;
		numbers [0][2]=30;
		numbers [0][3]=40;
		//2 row
		numbers [1][0]=1;
		numbers [1][1]=2;
		numbers [1][2]=3;
		numbers [1][3]=4;
		//3 row
		numbers [2][0]=9;
		numbers [2][1]=8;
		numbers [2][2]=7;
		numbers [2][3]=6;
		System.out.println(numbers[1][3]); //4
		System.out.println(numbers[0][1]); //20
		
		int rows=numbers.length; //gives # of 1d of arrays
		System.out.println("Number of rows = "+rows);
		
		int colsOf1row=numbers[0].length;
		System.out.println("Number of Columns in 1 row = "+colsOf1row);
		
		
		
		
	}

}
