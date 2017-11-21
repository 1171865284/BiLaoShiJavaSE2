package day6;

/*
 * 程序功能:类的封装
 * 程序员:魏国平
 * 编写时间:11月3日
 */
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person
{
	private int age;
	
 	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void speak()
	{
		System.out.println("age = " + age);
	}
}
