package day24.bean;

import java.io.Serializable;


/*
 *  Serialuzable:用于给序列化的类加入ID号。
 *  用于判断类和对象是否使用同一个，若是不是同一个就会出现异常
 */
public class Person implements Serializable {

	/**
	 * 因为我们设置了序列号所不无法读取到序列号
	 */
	private static final long serialVersionUID = 3178934;
	private String name;
	private int age;
	
	

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
