package day11;

/*
 * 程序功能:异常=自定义异常&异常类的抛出throws
 * 程序员:魏国平
 * 编写时间:11月12日
 */

/*
 * 对于角标是整数不存在，可以用角标越界表示
 * 对于负数为角标的情况，准备用负数角标异常来表示
 * 
 * 负数角标这种异常在java中并美誉定义过
 * 那就按照java异常的创建思想，面向对象，将负数角标进行自定义描述。并封装成对象。
 * 
 * 这种自定义的问题描述成为自定义异常
 * 
 * 注意：如果让一个类称为异常类，必须要继承异常体系，因为只有称为异常体系的子类才有资格具备可抛性
 * 	才可以被两个关键字所操作，throws	throw
 * 
 * 异常的分类：
 * 1.编译时被检测异常：只要是Exception和其子类都是，除了特殊子类 RuntimeException体系
 * 	这种问题一旦出现，希望在编译时就进行检测，让这种问题有对应的处理方式
 * 	这样的问题都可以针对性的处理。
 * 
 * 2.编译时不检测异常（运行时异常）：就是Exception中的RuntimeException和其子类
 * 	这种问题的发生，无法让功能继续，运算无法进行，更多时因为调用的原因导致的或者引发内部状态的改变导致的
 * 	那么这种问题一般不处理，直接编译通过，在运行时，让调用者调用时的程序强制停止，让调用者对代码进行修改
 * 
 * 所以自定义异常时，要么继承Exception.要么继承RuntimeException
 * 
 * throws和throw的区别
 * 
 * 1.throws使用在函数上
 * 	throw使用在函数内
 * 2.throws抛出的是异常类，可以抛出多个，用逗号隔开。
 * 	throw抛出的异常对象
 * 
 */
public class ExceptionDemo3 {

	public static void main(String[] args) throws FuShuIndexException3
	{
		// TODO Auto-generated method stub
		
		int [] arr = new int[3];
		
		Demo3 d = new Demo3();
		int num = d.method(arr, -30);
		System.out.println("num = " + num);
		System.out.println("over");
	}

}

class Demo3
{
	//声明抛出FuShuIndexException
	public int method(int [] arr, int index) throws FuShuIndexException3
	{
		if (index >= arr.length)
		{
			//手动捕捉异常并抛出
			throw new ArrayIndexOutOfBoundsException("数组的角标越界了：：：：：：" + index);
		}
		if (index < 0) {
			throw new FuShuIndexException3("角标成为负数了！");
		}
		
		return arr[index];
	}
}

//自定义异常
class FuShuIndexException3 extends Exception
{
	FuShuIndexException3() {
		// TODO Auto-generated constructor stub
	}
	
	FuShuIndexException3(String msg)
	{
		super(msg);
	}
}


/*class Person
{
	private String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}

class Student extends Person
{

	Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}*/