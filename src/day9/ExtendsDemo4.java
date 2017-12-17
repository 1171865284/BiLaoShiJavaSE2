package day9;

/*
 * 程序功能:子父类中的构造函数特点
 * 程序员:魏国平
 * 编写时间:
 */

/*
 * 子父类中的构造函数的特点
 * 
 * 在子类构造对象，发现，访问子类构造函数，父类也运行。
 * 为什么呢？
 * 原因是：在子类的构造函数中第一行有一个默认的隐式语句。super();
 * 
 * 子类的实例化工程：子类中所有的构造函数默认都会访问父类中的空参数的构造函数
 * 
 * 为什么子类实例化的时候要访问父类中的构造函数呢？
 * 那是因为子类·继承了父类，获取到了父类中内容（属性），所以在使用父类内容之前
 * 要先看父类是如何对自己的内容进行出事化的。
 * 
 * 所以子类在构造对象时，必须访问父类中的构造函数
 * 为什么完成这个必须的动作，就在子类的构造函数中加入了super().语句
 * 
 * 如果父类中没有定义空参数后汉书，那么子类的够着函数必须用super明确要调用
 * 父类中哪个构造函数。同时子类构造函数如果使用this调用了本类构造函数时，
 * 那么super就没有了，因为super和this都只能定义第一行，所以只能有一个。
 * 但是可以保证的时，子类中肯定会有其他的构造函数访问父类的构造函数。
 * 
 * 注意：super语句必须要定义在子类构造函数的第一行，因为父类的初始化动作要先完成
 */
public class ExtendsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi(6);
	}

}

class Fu
{
	Fu()
	{
		System.out.println("A fu run");
	}
	Fu(int x)
	{
		System.out.println("B fun run..." + x);
	}
}

class Zi extends Fu
{
	Zi()
	{	//super();//调用的就是父类中的空参数的构造函数
		System.out.println("C zi run");
	}
	Zi(int x)
	{
		System.out.println("D zi run ....." + x);
	}
}