package com.syntax.class10;

import java.util.Scanner;

public class GroupProjectTask2 {

	public static void main(String[] args) {
	
		        Scanner input=new Scanner(System.in);
		        System.out.println("Enter the number of indexes in array");
		        int index=input.nextInt();
		        String [] countries=new String[index];
		        System.out.println("Enter the name of the country ");
		        String  capital="null";
		        input.nextLine();
		        for (int i=0; i<index; i++){
		            countries[i]=input.nextLine();
		            
		        switch (countries[i]) {
		            case "Turkey":
		                capital="Ankara";
		                break;
		            case "Ukraine":
		                capital="Kiev";
		                break;
		            case "USA":
		                capital="DC";
		                break;
		            case "France":
		                capital="Paris";
		                break;
		            case "Spain":
		                capital="Madrid";
		                break;
		            case "India":
		                capital="New Delhi";
		                break;
		            case "Colombia":
		                capital="Bogota";
		                break;
		            default:
		                capital="unknown";
		        }
		            System.out.println("The capital of "+countries[i]+" is "+capital);
		        }
	}
}
