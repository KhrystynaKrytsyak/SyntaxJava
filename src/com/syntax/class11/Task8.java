package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		// Max and min number in the array?
		
		int[] arr= {10, 20, 50, 5, 8};
		int maxNum=arr[0];
		int minNum=arr[0];
		for (int num:arr) {
			if(num>maxNum) {
				maxNum=num;
			}
			if(num<minNum) {
				minNum=num;
			}
		}
		System.out.println(maxNum);
		System.out.println(minNum);
	}

}
