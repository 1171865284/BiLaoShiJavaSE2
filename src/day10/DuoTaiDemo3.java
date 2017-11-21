package day10;

/*
 * 程序功能:多态时，成员的特点
 * 程序员:魏国平
 * 编写时间:11月9日
 */
/*
 * 多态时，
 * 成员的特点：
 * 1.成员变量。
 * 	编译时：参考引用型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败
 * 	运行时：参考引用型变量所属的类中的师傅有调用的成员变量，并运行该所属类中的成员变量。
 * 	简单的所：编译和运行都参考等号的左边。over
 * 	作为了解
 * 
 * 2.成员函数（非静态）。
 * 	编译时：参考引用型变量所属的类中的是否有调用的函数。有，编译通过，没有，编译失败。
 * 	运行时L参考的时对象所属的类中是否调用的函数。
 * 	简单说：编译看左边，运行看右变
 * 
 * 3.静态函数。
 * 	编译时：参考引用型变量所属的类中的是否有调用的静态方法
 * 	运行时：参考引用型变量所属的类中的是否有调用的静态方法
 * 	简单说：编译和运行都看左边
 * 
 * 	其实对于静态方法，不需要对象的。直接用类名调用即可。
 */

class Fu2
{
//	int num = 3;
	void show()
	{
		System.out.println("fu show....");
	}
	
	static void method()
	{
		System.out.println("fu show static ...");
	}
}

class Zi2 extends Fu2
{
//	int num = 4;
	void show()
	{
		System.out.println("zi show.....");
	}
	
	static void method()
	{
		System.out.println("zi show static ...");
	}
}
public class DuoTaiDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fu2 f = new Zi2();
		f.method();
//		f.show();
//		System.out.println(f.num);
		
		/*从前的形式
		 * Zi2 z = new Zi2();
		System.out.println(z.num);*/
	}

}
