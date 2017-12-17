package day7;

/*
 * 程序功能:静态代码块的使用
 * 程序员:魏国平
 * 编写时间:11月6日
 */
public class StaticCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new StaticCode().show();
		/*Person4 p1 = new Person4();
		Person4 p2 = new Person4("旺财");
		p1.speak();
		p2.speak();
		new Person4();*/
	}

}

/*
 * 静态代码块
 * 随着类的加载而执行,而且只执行一次
 * 
 * 作用
 * 	用于给类进行初始化
 * 	
 */
class StaticCode
{
	static
	{
		System.out.println("hahahah");
	}
	void show()
	{
		System.out.println("show run");
	}
}

class Person4
{
	private String name;
	{//构造代码块，可以给所有对象进行初始化
		System.out.println("person run");
	}
	
	Person4()//是给对应的对象惊醒针对性的初始化
	{
		name = "body";
		cry();
	}
	Person4(String name)
	{
		this.name = name;
		cry();
	}
	public void speak()
	{
		System.out.println("name:" + name);
	}
	public void cry()
	{
		System.out.println("哇哇哇");
	}
}