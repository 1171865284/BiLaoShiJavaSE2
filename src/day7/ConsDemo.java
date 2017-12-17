package day7;

public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Person p1 = new Person("小强",19);
		p1.speak();
	}

}

class Person
{
	private String name;
	private int age;
	//定义一个Person类的构造函数
	Person()//构造函数，而且是空参数。
	{
		// TODO Auto-generated constructor stub
		name = "baby";
		age = 1;
		System.out.println("person run");
	}
	//如果有的孩子一出生就有名字
	Person (String n)
	{
		name = n;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	Person (String n, int a)
	{
		name = n;
		age = a;
	}
	public void speak()
	{
		/*
		 * 构造函数：构建创造对象是调用的函数。作用：可以给对象进行初始化
		 * 创建对象都必须要通过构造函数初始化
		 * 
		 * 一个类中如果没有定义过构造函数，那么该类中会有一个默认的空参数构造函数
		 * 如果在类中定义了指定的构造函数，那么类中的默认构造函数就没有了
		 * 
		 * 一般函数和构造函数什么区别？
		 * 构造函数：对象创建时，就会调用与之对应的构造函数，对对象进行初始化
		 * 一般函数：对象创建后 ，需要函数功能时才调用
		 * 
		 * 什么时候定义构造函数
		 * 在描述事物时，该事物已存在就具备的一些内容，这些内容，这些聂荣都定义在构造函数中
		 * 
		 * 构造函数：对象创建时，会调用只调用一次
		 * 一般函数：对象创建后，可以被多次调用
		 */
		System.out.println(name + ":" + age);
	}
}