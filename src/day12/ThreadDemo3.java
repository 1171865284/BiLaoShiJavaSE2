package day12;

class Demo3 extends Thread
{
	private String name;
	Demo3(String name)
	{
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void run()
	{
		for (int x = 0; x < 10; x++) {
//			for (int y = 0; y < 10; y++) {}
			System.out.println(name + ".....x = " + x + "...name =" +Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 创建线程的目的是为了开启一条执行路径，去运行指定的代码和其他代码实现同时运行。
		 * 而运行的指定代码就是着执行路径的任务
		 * 
		 * jvm创建的主线程的任务都定义在了主函数中。
		 * 
		 * 而自定义的线程她的任务在哪呢？
		 * Thread类用于描述线程，线程是需要任务的。所有Thread类也对任务的描述。
		 * 这个任务是通过Thread类中的run方法来体现。也就是说，run方法就是封装自定义线程运行任务的函数
		 *
		 * run方法中定义就是线程要运行的任务代码
		 * 
		 * 开启线程是为了运行指定代码，只有继承Thread类，并复写run方法。
		 * 将运行的代码定义在run方法中即可
		 * */
//		Thread t1 = new Thread(); 
		
		Demo2 d1 = new Demo2("张三");
		Demo2 d2 = new Demo2("wangcai");
		d1.start();//开启线程，调用run()方法
		d2.start();
		
		System.out.println(4/0);//thread new
		
		for (int x = 0; x < 20; x++) {
			System.out.println("over...." + Thread.currentThread().getName());
		}
	}

}
