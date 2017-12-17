package day10;

/*
 * 程序功能:接口的应用
 * 程序员:魏国平
 * 编写时间:11月9日
 */

/*
 * 笔记本电脑的使用
 * 为了扩展笔记本的功能，但日后出现什么功能设备知道
 * 
 * 定义一个规则，只能日后出现的设备都符合这个规则就可以了。
 * 规则在java中就是一个接口
 */

interface USB
{
	public void open();
	public void close();
	
}

public class BookPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useUSB(new UPan());
		useUSB(new UsbMouse());
	}
	//使用规则，接口类型的引用，用于接收（指向）接口的子类对象
	public static void useUSB(USB u)
	{
		u.open();
		u.close();
	}
}

class UPan implements USB
{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("upan open");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("upan close");
	}
	
}

class UsbMouse implements USB
{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("UsbMouse open");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("UsbMouse close");
	}
	
}