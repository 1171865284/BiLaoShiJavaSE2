package day10;

import day7.ThisDemo;

/*
 * 程序功能:内部类的使用---细节
 * 程序员:魏国平
 * 编写时间:11月10
 */

/*
 * 为什么内部类能直接访问外部类中成员呢？
 * 那是因为内部类持有了外部类的引用。	外部类名.this
 */

class Outer2
{
	int num =3;
	class Inner
	{
		int num = 4;
		void show()
		{
			int num = 5;
//			System.out.println(num);//num=5
//			System.out.println(Inner.this.num);//num=4
			System.out.println(Outer2.this.num);//num=3
		}
	}
	void method()
	{
		new Inner().show();
		System.out.println(this.num);
	}
}

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Outer2().method();
	}

}
