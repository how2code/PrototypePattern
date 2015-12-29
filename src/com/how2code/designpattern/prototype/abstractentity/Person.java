package com.how2code.designpattern.prototype.abstractentity;

public abstract class Person implements Cloneable {
	private long id;
	private String name;
	private String surname;
	
	public abstract void appear();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public Object clone() {
		Object clonedObject = null;
		try {
			clonedObject = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedObject;
	}
}
