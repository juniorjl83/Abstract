package com.abstracta.test;

public class Teacher extends Person implements Work {

	@Override
	public long getSalary(int days) {
		return (long) (days * 10 * 1.5);
	}

	@Override
	public void cleanDishes() {
		System.out.println("Using the machine cleaning");
	}

}
