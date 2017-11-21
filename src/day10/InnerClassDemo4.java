package day10;

/*
 * 程序功能:匿名内部类---概述
 * 程序员:魏国平
 * 编写时间:11月11日
 */

/*
 * 匿名内部类。就是内部类的简写格式。
 * 	
 * 	必须有前提：
 * 	内部类必须继承或者实现一个外部类或者接口。
 * 
 * 匿名内部类：其实就是一个匿名
 */

abstract class Demo
{
	abstract void show();
}

class Outer4
{
	int num = 4;
	/*class Inner4
	{
		void show()
		{
			System.out.println("show...." + num);
		}
	}*/
	
	public void method()
	{
//		new Inner4().show();
		new Demo() {
			
			@Override
			void show() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}

public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
