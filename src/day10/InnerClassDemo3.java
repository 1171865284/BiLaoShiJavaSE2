package day10;

/*
 * 程序功能:内部类的使用----局部内部类
 * 程序员:魏国平
 * 编写时间:11月10日
 */

/*
 * 内部类可以存放在局部位置上
 * 
 * 内部类在局部位置上只能访问局部中被final修饰的局部变量
 */
class Outer3
{
	int num = 3;
	void method()
	{
		final int x = 9;
		
		class Inner
		{
			void show()
			{
				System.out.println("show...." + x);
			}
		}
		
		Inner inner = new Inner();
		inner.show();
	}
}

public class InnerClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer3().method();
	}

}

class Fu3 extends Object
{
	
}

class Zi3 extends Fu3
{
	
}