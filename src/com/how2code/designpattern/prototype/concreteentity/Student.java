package com.how2code.designpattern.prototype.concreteentity;

import com.how2code.designpattern.prototype.abstractentity.Person;

public class Student extends Person {
	
	public Student(long id, String name, String surname) {
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
	}

	@Override
	public void appear() {
		System.out.println("Hi! My name is " + this.getName() + " " + this.getSurname() + " and I'm a student!");
	}

}
