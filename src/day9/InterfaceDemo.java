package day9;

/*
 * 程序功能:接口使用
 * 程序员:魏国平
 * 编写时间:11月8日
 */

/*
 * 当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用
 * 另一种形式定义和表示，就是	接口	interface
 * 
 * 定义接口使用的关键字不是class， 时infterface
 * 对于接口当中常见的成员：而且这些成员都有固定的修饰符
 * 1.全局常量：public static final
 * 
 * 2.抽象方法:public abstract
 * 
 * 由此得出结论，接口中的成员都时公共的权限
 * 
 * 类与类之间是继承关系，类与接口直接是实现关系。
 * 
 * 接口不可以实例化
 * 
 * 只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化
 * 否则，这个子类就是一个抽象类
 * 
 * 在java中不直接支持多继承，因为会出现调用的不确定性。
 * 所以java将多继承机制进行改良，在java中变成了多实现
 * 
 * 一个类可以实现对各接口
 * 
 * 一个类在继承另一个类的同时，还可以实现多个接口
 * 接口的出现避免了单继承的局限性
 */
class Q
{
	public void method()
	{}
}

class Test2 extends Q implements A,Z
{

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showZ() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Demo1
{
	public static final int NUM = 4;
	public abstract void show1();
	public abstract void show2();
}

class DemoImpl implements Demo1
{

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}
	
}

interface A
{
	public void showA();
}

interface Z
{
	public void showZ();
}
//多实现
class Test implements A,Z
{

	@Override
	public void showZ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoImpl d = new DemoImpl();
		System.out.println(d.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(Demo1.NUM);
	}

}

/*abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}*/