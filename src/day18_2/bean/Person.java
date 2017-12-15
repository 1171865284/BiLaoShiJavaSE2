package day18_2.bean;

public class Person {

	private String name;
	private int age;
	
	//构造函数
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//空参构造函数
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
