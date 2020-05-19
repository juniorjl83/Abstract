package com.abstracta.test;

public abstract class Person {

	private String name;
	private String id;

	abstract public long getSalary(int days);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
