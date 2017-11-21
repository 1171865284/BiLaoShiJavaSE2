package day8;

import day7.ThisDemo;

public class ExtendsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zi = new Zi();
		zi.show();
	}

}

/*
 * 在子父类中，成员的特点体现
 * 1.成员变量
 * 2.成员函数
 * 3.构造函数
 * 
 * 当本类的成员和局部变量同名用this区分
 * 当子父类中的成员变量同名用super区分父类
 * 
 * this和super很相识
 * 
 * this代表一个本类对象的引用
 * super：代表一个父类空间
 */

class Fu
{
	int num = 4;
}

class Zi extends Fu
{
	int num = 5;
	void show()
	{
		System.out.println(this.num + "........." + super.num);
	}
}
