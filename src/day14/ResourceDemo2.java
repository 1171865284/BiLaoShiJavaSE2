package day14;


/*
 * 程序功能：等待线程机制
 * 程序员：魏国平
 * 编写时间：11月22日
 */

/*
 * 等待唤醒机制。
 * 
 * 涉及的方法：
 * 
 * 1.wait();	让线程处于冻结状态，被wait的线程会被存储到线程池中
 * 2.notify();	唤醒线程池中的一个线程（任意的）
 * 3.notifyAll();	唤醒线程池中的所有线程（让所有线程处于运行状态）
 * 
 * 这些方法都必须定义在同步中
 * 因为这些方法是用于操作线程状态的方法。
 * 必须要明确到底是那个锁上的线程。
 * 
 * 为什么操作线程的方法wait notify notifyAll定义在了Object类中。
 * 
 * 因为这些方法是监视器的方法，监视器其实就是锁。
 * 锁可以是任意的对象，任意的对象调用的方法一定定义在Object类中
 */

//资源
class Resource2
{
	 String name;
	String sex;
	boolean flag = false;
}

//输入
class Input2 implements Runnable
{

	Resource2 r;
	//构造函数Input
//	Object object = new Object();
	Input2(Resource2 r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		while(true)
		{
			synchronized (r) {
				if(r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (x==0) {
					r.name = "mile";
					r.sex = "nan";
				}
				else {
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
				r.flag = true;
				r.notify();
			}
			x = (x+1)%2;
			
			
		}
	}
	
}

//输出
class Output2 implements Runnable
{
	Resource2 r;
//	Object object = new Object();
	//构造函数Output
	Output2(Resource2 r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(true)
			{
				synchronized (r) {
					if(!r.flag)
						try {
							r.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				System.out.println(r.name + "...." + r.sex);
				r.flag = false;
				r.notify();
				}
			}
	}
}


public class ResourceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建资源
		Resource2 r = new Resource2();
		
		//创建任务
		Input2 input = new Input2(r);
		Output2 output = new Output2(r);
		
		//创建线程，执行路径。
		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);
		
		//开启线程
		t1.start();
		t2.start();
	}

}
