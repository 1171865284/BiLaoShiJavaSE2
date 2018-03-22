package day28.bean;

public class Person {

	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void show(){
		System.out.println(name + "...show run ..." + age);
	}
	
	public void method(){
		System.out.println(name + "... method ..." + age);
	}
	
	public void pasMethod(String name, int age){
		System.out.println(name + ".....pasMethod run ...." + age);
	}
	
	
}
