package day13;

/*
 * 程序功能:卖票实例
 * 程序员:魏国平
 * 编写时间:11月17日
 */

/*
 * 需求：卖票实例
 * 
 * 线程安全问题产生的原因：
 * 
 * 1.多个线程在操作共享的数据
 * 2.操作共享数据的线程代码有多条。
 * 
 * 当一个线程在执行操作共享数据的多条线程过程中，其他线程参与了运算。
 * 就会导致线程安全问题的产生。
 * 
 * 解决思路：
 * 就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码的时候，
 * 其他线程是不可以参与运算。
 * 必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算。
 * 
 * 在java中，用同步代码块就可以解决这个问题。
 * 
 * 同步代码块的格式：
 * synchronized(对象)
 * {
 * 		需要被同步的代码；
 * }
 * 
 * 同步的好处：解决了线程的安全问题。
 * 
 * 同步的弊端：相对降低了效率，因为同步外的线程的都会判断同步锁。
 * 
 * 同步的前提：同步中必须有的个线程并使用同一个锁
 */

class Ticket implements Runnable //extends Thread
{
	private int num = 100;
	Object object = new Object();
	
	public void run()
	{
		sale();
	}
	public void sale()
	{
		while(true){
			//同步代码块
			synchronized (object) {
				//因为在现实中的售票是没有出现负票的情况的
				if(num > 0)
				{
					try {
						Thread.sleep(10);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
				}
			}
		}
	}
}

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();*/
		
		Ticket t = new Ticket();//创建一个线程任务对象(这个卖火车票的)
		Ticket tt = new Ticket();//创建一个线程任务对象(这个卖动车票的)
		
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
