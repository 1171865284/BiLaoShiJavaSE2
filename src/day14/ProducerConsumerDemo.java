package day14;

/*
 * 程序功能：多生产者多消费者问题示例
 * 程序员：魏国平
 * 编写时间：11月22日
 */

/*
 *生产者，消费者。
 */

class Resrouce5
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	//生产者
	public synchronized void set(String name)
	{
		if(flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		this.name = name + count;
		
		count++;
		
		System.out.println(Thread.currentThread().getName()+"...生产者.." + this.name);
		flag = true;
		notify();
	}
	
	//消费者
	public synchronized void out()
	{
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName() + "..消费者.." + this.name);
		flag = false;
		notify();
	}
}

class Producer implements Runnable
{
	private Resrouce5 r;
	public Producer(Resrouce5 r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		r.set("烤鸭");
	}
	
}

class Consumer implements Runnable
{
	private Resrouce5 r;
	public Consumer(Resrouce5 r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resrouce5 r = new Resrouce5();
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		
		t1.start();
		t2.start();
	}

}
