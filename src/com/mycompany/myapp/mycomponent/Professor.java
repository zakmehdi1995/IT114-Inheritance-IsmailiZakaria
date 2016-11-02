package com.mycompany.myapp.mycomponent;

public class Professor extends PersonBase {
//public class Professor extends PersonBase implements Person {
	private String  title;
	
	public Professor(String _name, Integer _age, String _title) {
		super(_name, _age);
		title = _title;
	}
	public String getName() {
		return "Prof: " + super.getName();
	}


}
