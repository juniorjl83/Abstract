package com.abstracta.test;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		String name = "Jose Luis";
		Employee junior = new Employee();
		
		if (!StringUtil.isEmpty(name)) {
			junior.setName(name);
		} else {
			throw new Exception("name is empty");
		}
		
		junior.talk("Hola");
	}

}
