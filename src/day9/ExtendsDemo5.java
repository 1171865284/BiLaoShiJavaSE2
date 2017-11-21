package day9;

/*
 * 程序功能:继承的使用
 * 程序员:魏国平
 * 编写时间:11月7日
 */
/*
 * 一个对象实例化过程
 * Person p = new Person();
 * 1.JVM会读取指定的路径下的Person.class文件，并加载进内存
 * 	并会先加载Person的父类（如果有直接的父类的情况下）。
 * 2.在堆内存中的开辟空间，分配地址
 * 3.并在对象空间中，对对象中的属性进行默认初始化。
 * 4.调用对应的构造函数进行初始化
 * 5.在构造函数中，第一行会先调用父类中的构造函数进行初始化。
 * 6.父类初始化完毕后，在对子类的属性进行显示初始化
 * 4.在进行子类构造函数的特定初始化
 * 8.初花完毕后，将地址值赋值给引用变量
 */
public class ExtendsDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi2 z = new Zi2();
		z.show();
	}

}

class Fu2
{
	Fu2()
	{
		super();
		show();
		return;
	}

	void show() {
		// TODO Auto-generated method stub
		System.out.println("fu show");
	}
}

class Zi2 extends Fu2
{
	int num = 8;
	Zi2()
	{
		super();
		//通过super初始化父类内容时，子类的成员变量并未显示初始化，等super()父类初始化
		//完毕后，才进行子类的成员变量显示初始化。
		return;
	}
	void show()
	{
		System.out.println("zi show .." + num);
	}
}
