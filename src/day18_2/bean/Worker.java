package day18_2.bean;

import day18.bean.Person;

public class Worker extends Person {

	public Worker() {
		super();
		
	}

	public Worker(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		
		return "Worker:"+getName()+":"+getAge();
	}
	
	
 
}
