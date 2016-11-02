package com.mycompany.myapp.mycomponent;

public abstract class PersonBase implements Person {
	protected String  name;
	protected Integer age;
	
	public PersonBase(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public PersonBase() {

	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}

}
