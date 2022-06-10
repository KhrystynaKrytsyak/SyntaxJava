package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="fdsjfkljdflkfjskdjflk&*^%*&(f";
		System.out.println(str.replaceAll("[0-9]", "#"));
		System.out.println(str.replaceAll("[a-z]", "#"));
		System.out.println(str.replaceAll("[A-Z]", "#"));
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "_"));
		System.out.println(str.replaceAll("[^A-Z]", "*"));
		System.out.println(str.replaceAll("[^A-Za-Z0-9]", "*"));
		
		str="abcskdfjsflsk";
		System.out.println(str.replaceAll("[a-f]", "*"));
		str="sfkskldfsjfljshwjjjh(^(&)(*)_)>?";
		System.out.println(str.replaceAll("[^A-za]", "*"));
	
		}

}
