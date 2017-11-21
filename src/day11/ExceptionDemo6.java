package day11;

/*
 * 程序功能:异常的注意事项
 * 程序员:魏国平
 * 编写时间:11月13日
 */

/*
 * 异常的注意事项：
 * 
 * 1.子类在覆盖父类方法时，父类的方法如果抛出了异常，
 * 那么子类的方法只能抛出父类的异常或者该异常的子类。
 * 
 * 2.如果父类抛出多个异常，那么子类只能抛出父类异常的子集。
 * 
 * 简单说：子类覆盖父类只能抛出父类的异常或者子类或者子集
 * 
 * 注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛
 */

interface Inter
{
	void function();
}

class A extends Exception
{
	
}

class B extends A
{
	
}

class C extends Exception
{
	
}

class Fu
{
	void show() throws A, C
	{
		
	}
}

class Test
{
	void method(Fu f) throws C
	{
		try {
			f.show();
		} catch (A e) {
			// TODO: handle exception
		}
	}

	public void show(Fu fu) {
		// TODO Auto-generated method stub
		
	}
}


class Zi extends Fu
{
	void show() throws C
	{
		
	}
}

public class ExceptionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.show(new Zi());
	}

}
