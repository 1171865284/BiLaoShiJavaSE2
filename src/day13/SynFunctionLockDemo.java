package day13;

/*
 * 程序功能：同步函数的使用
 * 程序员：魏国平
 * 编写时间：11月20日
 */


/*
 * 同步函数的使用的锁是this；
 * 
 * 同步函数和同步代码块的区别是：
 * 同步函数的锁匙固定的this。
 * 
 * 同步代码块的锁是任意的对象。
 * 
 * 建议使用同步代码块。
 * 
 * 静态的同步函数使用的锁是	该函数所属字节码文件对象
 *可用getClass方法获取，也可以用当前	类名.class表示
 *
 *死锁：常见情景之一：同步的嵌套
 *
 *在同步函数中加入同步代码块，同步代码块中加入同步函数
 * 
 */
public class SynFunctionLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket2 t = new Ticket2();//创建一个线程任务对象(这个卖火车票的)
//		Ticket2 tt = new Ticket2();//创建一个线程任务对象(这个卖动车票的)
		
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		t.flag = false;
		t2.start();
	}

}

class Ticket2 implements Runnable //extends Thread
{
	public boolean flag = true;
	private static int num = 100;
	Object object = new Object();
	
	public void run()
	{
		if (flag) {
			while(true){
				//同步代码块
				synchronized (object) {
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
		else {
			while(true)
			{
				show();
			}
		}
	}
	
	public static synchronized void show()
	{
		//因为在现实中的售票是没有出现负票的情况的
		if(num > 0)
		{
			try {
				Thread.sleep(10);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ".....function...." + num--);
		}
	
	}
}