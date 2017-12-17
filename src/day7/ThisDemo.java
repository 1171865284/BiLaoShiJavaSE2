package day7;

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person1 p1 = new Person1("旺财");
		p1.speak();
		Person1 p2 = new Person1("小强");
		p2.speak();*/
		Person1 p1 = new Person1("小强", 22);
		Person1 p2 = new Person1("小运", 32);
	}

}

/*
 * 当成员变量和局部变量重名时，可以用this来区分
 * 
 * this:代表对象。代表那个对象呢？当前对象
 * 		this就所在函数所属对象的引用。
 * 		简单说：那个对象调用了this所在的函数，this就代表那个对象
 * 
 * this也可以用于在构造函数中调用其它构造函数
 * 注意：只能定义在构造函数的第一行,因为初始化动作要先执行
 */
class Person1
{
	private String name;
	private int age;
	Person1()
	{
		this.name = "bady";
		this.age = 1;
		System.out.println("oerson run");
	}
	Person1(String name)
	{
		this.name = name;
	}
	Person1(String n, int a)
	{
		this.name = n;
		this.age = a;
	}
	public void speak()
	{
		System.out.println(name + ":" + age);
	}
	
	/*
	 * 判断是否是同龄人
	 */
	public boolean compare(Person1 p)
	{
		return this.age == p.age;
	}
}
