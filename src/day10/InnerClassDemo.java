package day10;

/*
 * 程序功能:内部类的使用
 * 程序员:魏国平
 * 编写时间:11月9日
 */

/*
 * 内部类访问的特点：
 * 1.内部类可以直接访问外部类中的成员
 * 2.外部类要访问内部类，必须建立内部类的对象
 * 
 * 一般用于类的设计。
 * 
 * 分析事物时，发现该事物描述中还有事物还在访问被描述事物的内容
 * 这时就是还有的事物定义成内部类来描述。
 * 
 * 
 */
class Outer
{
	private static int num = 3;
	
	static class Inner//内部类
	{
		void show()
		{
			System.out.println("show run..." + num);
		}
		static void function()//如果内部类中定义了静态成员，该内部类也必须时静态的。
		{
			System.out.println("function run ...." + num);
		}
	}
	
	public void method()
	{
		Inner in = new Inner();
		in.show();
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Outer out = new Outer();
//		out.method();
		//直接访问外部类中的内部类中的成员
//		Outer.Inner in = new Outer().new Inner();
//		in.show();
		//如果内部类时静态的。那就相当于一个外部类
//		Outer.Inner in = new Outer.Inner();
//		in.show();
		//如果内部类时静态的，成员时静态的。
		Outer.Inner.function();
		
	}

}
