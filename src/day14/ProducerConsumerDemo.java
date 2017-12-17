package day14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 程序功能：多生产者多消费者问题示例
 * 程序员：魏国平
 * 编写时间：11月22日
 */

/*
 *生产者，消费者。
 *
 *多生产者，多消费者问题。
 *if判断标记	只有一次，会导致不该运行的线程运行了。出现了数据错误的情况。
 *while判断标记，解决了线程获取执行权后，是否要运行！
 *
 *notify:只能唤醒一个线程，如果本方唤醒了本方，没有意义，而且while判断标记+notify会导致死锁
 *notifyAll解决了，本方线程一定会唤醒对方线程的问题。
 */

class Resrouce5
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	//添加Lock接口
	//创建一个锁对象
	Lock lock = new ReentrantLock();
	
	//通过已有的锁获取该锁上的监视器对象
	//生产者
	public synchronized void set(String name)
	{
		lock.lock();
		try {
			while(flag)
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			this.name = name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...生产者.." + this.name);
			flag = true;
//		notify();
			notifyAll();
		}
		finally {
			lock.unlock();
		}
	}
	
	//消费者
	public synchronized void out()
	{
//		if(!flag)
		//设置锁
		lock.lock();
		try {
			while(!flag)
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName() + "..消费者......." + this.name);
			flag = false;
			notify();
		}
		finally {
			//释放锁
			lock.unlock();
		}
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
		while(true)
		{
			r.set("烤鸭");
		}
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
		
		Thread t0 = new Thread(pro);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(con);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
