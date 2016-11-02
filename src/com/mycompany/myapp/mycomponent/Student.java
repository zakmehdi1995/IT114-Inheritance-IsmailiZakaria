package com.mycompany.myapp.mycomponent;

public class Student extends PersonBase implements  Studying{
	
	private String grade;
	private String id;
	
	public Student() {
		super("Zakaria", 95);
	}
	public Student(String _name, Integer _age) {
		super(_name, _age);
		name = _name;
		age = _age;
	}
/*
	public Student(String _name, Integer _age, String _grade) {
//		super();	// this line is implied if it is not there
		super.name = _name;
		this.name = _name + "goes to this classes attribute";
		name = _name + "interesting";
		super.age = _age + 10;
		this.age = _age + 20;
		age = _age;
		grade = _grade;
	}
*/	
	public Student(String _name, Integer _age, String _grade) {
		this(_name, _age);
//		name = _name;
//		age = _age;
		grade = _grade;
	}
	public Student(String _name, Integer _age, String _grade, String _id) {
		this(_name, _age, _grade);
//		super(_name, _age);
//		name = _name;
//		age = _age;
		id = _id;
	}
	public String getName(String _name, Integer _age) {
		return name;
	}
	public String getName(String _lastName) {
		return name + _lastName;
	}
	@Override
	public Integer getAge() {
		return age - 10;
	}
	@Override
	public String studyFor() {
		return "JAVA";
	}

}
