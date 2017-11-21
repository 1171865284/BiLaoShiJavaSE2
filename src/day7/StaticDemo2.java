package day7;

/*
 * 程序功能:static关键字的使用
 * 程序员:魏国平
 * 编写时间:11月6日
 */
public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3.method();
		
		Person3 p =new Person3("小强", 90);
		p.show();
	}

}

class Person3
{
	private String name;
	private int age;
	static String country = "CN";
	public Person3(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void show()
	{
		System.out.println(Person3.country+":"+this.name+":"+this.age);
	}
	
	public static void method()
	{
		System.out.println(Person3.country);
	}
}