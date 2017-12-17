package day13;

/*
 * 程序功能：死锁程序
 * 程序员：魏国平
 * 编写时间：11月20日
 */


/*
 * 死锁：常见情景之一：同步的嵌套
 * 
 * 在同步函数中加入同步代码块，同步代码块中加入同步函数
 */

class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag = flag;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		if (flag) {
			synchronized (MyLock.locka) {
				System.out.println(Thread.currentThread().getName()+"......if   lock.....");
				synchronized (MyLock.lockb) {
					System.out.println(Thread.currentThread().getName()+"....if   lock.....");
				}
			}
		}
		else {
			synchronized (MyLock.lockb) {
				System.out.println(Thread.currentThread().getName()+"...else  lock......");
				synchronized (MyLock.locka) {
					System.out.println(Thread.currentThread().getName()+".....else   lock.....");
				}
			}
		}
	
		
	}
}

class MyLock
{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
}

public class DeadLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test(true);
		Test b = new Test(false);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}

}
