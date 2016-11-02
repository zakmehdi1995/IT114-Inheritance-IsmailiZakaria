package com.mycompany.myapp.mycomponent;

public class MainEntryClass {

	public static void main(String[] args) {
		System.out.println("BEGIN");
		
		Student s1 = new Student("Zakaria", 21, "College", "1234");
		System.out.println("s1 name:" + s1.getName());
		
		Professor p1 = new Professor("Albert", 101, "Ordinarious");
		System.out.println("p1 name:" + p1.getName());
		
		Person person1 = s1;
		System.out.println("person1 name:" + person1.getName());
		Studying studying1 = s1;
		System.out.println("studying1 studyFor:" + studying1.studyFor());
		
		Person person2 = new Student("kiris", 22, "college", "4321");
		System.out.println("person1 name:" + person2.getName());
	}
}
