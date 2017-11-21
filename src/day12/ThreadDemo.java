package day12;

/*
 * 程序功能:多线程--进程
 * 程序员:魏国平
 * 编写时间:11月14日
 */

/*
 * 进程：正在进行中的程序（直译）
 * 
 * 线程：就是进程中一个负责程序执行的控制单元（执行路径）
 * 一个进程中可以多执行路径，称之为多线程
 * 
 * 一个进程中至少要有一个线程
 * 
 * 想要多部分代码同时运行是使用多线程
 * 
 * 开启多个线程是为了同时运行多部分代码。
 * 
 * 每一个线程都有自己运行的内容。这个内容可以称为线程要执行的任务
 * 
 * 多线程好处：解决了多部分同时运行的问题
 * 
 * 多线程的弊端：线程太多回放效率的降低
 * 
 * 其实应用程序的执行都是cpu在做着快熟的切换完成的。这个切换是随机的。
 * 
 * JVM启动时就启动了多个线程，至少有两个线程可以分析的出来
 * 
 * 1.执行main函数的线程
 * 	该线程的任务代码都定义在main函数中
 * 2.负责垃圾回收的线程
 * 	
 * 运行结果（现象）：
 *1. Hello World
	demo ok
	demo ok
	demo ok
	2.demo ok
	Hello World
	demo ok
	demo ok
	3.demo ok
	demo ok
	demo ok
	Hello World
 */

class Demo extends Object
{
	public void finalize()
	{
		System.out.println("demo ok");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();
		new Demo();
		new Demo();
		System.gc();
		System.out.println("Hello World");
	}

}
