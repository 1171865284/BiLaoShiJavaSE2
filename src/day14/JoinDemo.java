package day14;

/*
 * 程序功能：join方法的使用
 * 程序员：魏国平
 * 编写时间：12月2日
 */

/*
 * 
 */

class Demo implements Runnable
{
	public void run()
	{
		for (int x = 0; x < 50; x++) {
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		/*try {t1.join();//t1线程要申请加入进来，运行。临时加入一线程运算是可以使用join方法。} catch (InterruptedException e) {e.printStackTrace();}*/
		t2.start();
//		t2.setPriority(Thread.MAX_PRIORITY);
		
		for (int x = 0; x < 50; x++) {
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}

}
