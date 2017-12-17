package day14;
/*
 * 程序功能：下面两道面试题
 * 程序员：魏国平
 * 编写时间：12月2日
 */

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//线程一
		new Thread(){
			public void run()
			{
				for (int x = 0; x < 50; x++) {
					System.out.println(Thread.currentThread().getName() +"...x = " + x);
				}
			}
		}.start();
		
		for (int x = 0; x < 50; x++) {
			System.out.println(Thread.currentThread().getName() +"...y = " + x);
		}
		
		//线程三
		Runnable r = new Runnable()
		{
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int x = 0; x < 50; x++) {
					System.out.println(Thread.currentThread().getName() +"...z = " + x);
				}
			}
		};
	}

}

/*
 * 题目：下面代码是否有错误，如果有，发生在哪一行？
 * class Test implements Runnable
{
	public void run(Thread t)
	{
		
	}
}
错误在第一行应该被abstract修饰
test 不是抽象的 未覆盖接口中的run()方法
---------------------------------
---------------------------------
---------------------------------
class ThreadTest
{
	public static void main(String [] args)
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				System.out.println("runnable run");
			}
		})
		{
			
		}.start();
	}
}
*/
