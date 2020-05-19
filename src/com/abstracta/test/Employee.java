package com.abstracta.test;

public class Employee extends Person implements Exercise, Work {

	@Override
	public void run(int distance) {
		System.out.println(getName() + " is runing " + distance + " kms");

	}

	@Override
	public void talk(String message) throws Exception {
		if (!StringUtil.isEmpty(message)) {
			System.out.println(getName() + " is talking " + message);
		} else {
			throw new Exception("message is empty");
		}

	}

	@Override
	public long getSalary(int days) {
		return (long) (days * 10 * 1.2);
	}

	@Override
	public void cleanDishes() {
		System.out.println("Cleaning disches on hand");

	}

}
