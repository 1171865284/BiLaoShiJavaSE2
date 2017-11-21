package day13;

/*
 * 程序功能:线程的使用----实现Runnable接口
 * 程序员:魏国平
 * 编写时间:11月17日
 */

/*
* 创建线程的第二种方式：实现Runnable接口
* 
* 准备扩展Demo类的功能，让其中的内容可以作为线程的任务执行
* 通过接口的形式完成。
* 
* 1.定义类实现Runnable接口
* 2.覆盖接口中的run方法，将线程的任务代码封装到run方法中。
* 3.通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递
* 	为什么？因为线程的热播我也都封装在Runnable接口子类对象的run方法中。
* 	所以要在线程对象创建时就必须明确运行的接口。
* 	
* 4.调用线程对象的start方法开启线程。
* 
* 实现Runnable接口的好处：
* 1.将线程的任务从线程的子类中分离出来，进行了单独的封装。
* 	按照面向对象的思想将任务的封装对象。
* 2.避免了java单继承的局限性
* 
* 所以创建线程的第二种方式较为常用
 */

class Demo2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}
	
	public void show()
	{
		for (int x = 0; x < 20; x++) {
			//显示线程动态，显示线程的序列号
			System.out.println(Thread.currentThread().getName() + "...." + x);
		}
	}
}
 
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}

}
