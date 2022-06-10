package com.syntax.reviewclass6;

public class School {

	public static void main(String[] args) {
		

		Student student1 = new Student();
		student1.name="Samira";
		student1.lastName="Pashayeva";
		student1.address="Virginia";
		
		student1.studentId=101;
		student1.age=25;
		student1.grade='A';
		
		//student1.subject="Java"; //compiler error subject cannot be resolved or is not a field
		//student1.subject="Java";
		
		Student student2=new Student();
		//accessing variables of Student class
		student2.name="Omid";
		student2.lastName="Mahmoodi";
		student2.address="California";
		
		student2.studentId=102;
		student2.age=18;
		student2.grade='A';
		System.out.println("_________________________");
		
		student1.study();
		student1.doHomework();
		String fullName=student1.getFullName();
		System.out.println(fullName);
		fullName=student2.getFullName();
		System.out.println(fullName);
		

	}

}
