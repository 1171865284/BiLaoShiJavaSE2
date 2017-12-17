package day13;

/*
 * 程序功能：线程安全问题的实例
 * 程序员：魏国平
 * 编写时间：11月19日
 */


/*
 * 需求储户，两个，每个都到银行存钱每次存100，共三次
 * 同步的两种方式：
 * 1.同步代码块
 * public void add(int num)
	{
		synchronized (object) {
			sum = sum + num;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sum = " + sum);
		}
	2.同步函数
	public synchronized void add(int num)
	{
			sum = sum + num;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sum = " + sum);
	}
 */

class Bank
{
	private int sum;
	Object object = new Object();
	public synchronized void add(int num)
	{
//		synchronized (object) {
			sum = sum + num;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("sum = " + sum);
//		}
	}
}

class Cus implements Runnable
{
	private Bank bank = new Bank();
	public void run()
	{
		//这样写的话就是两个线程在两个银行里存钱
//		Bank bank = new Bank();
		for (int x = 0; x < 3; x++) {
			bank.add(100);
		}
	}
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cus cus = new Cus();
		
		Thread t1 = new Thread(cus);
		Thread t2 = new Thread(cus);
		
		t1.start();
		t2.start();
	}

}
