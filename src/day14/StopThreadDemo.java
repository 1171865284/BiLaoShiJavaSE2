package day14;

/*
 * 程序功能:停止线线程的使用方法案例
 * 程序员：魏国平
 * 编写时间：12月1日
 */

/*
 * 停止线程：
 * 1.stop方法。
 * 
 * 2.run方法结束。
 * 
 * 怎么控制线程的任务结束呢？
 * 任务中都会有循环结构，只要控制住循环就可以结束任务。
 * 
 * 控制循环通常就用定义标记来完成。
 * 
 * 但是如果线程处于冻结状态，无法读取标记。如何结束呢？
 * 
 * 可以使用interrupt()方法将线程从冻结状态强制恢复到运行状态中来，让线程具备cpu的执行资格
 * 
 * 当时强制动作发生了InterruptedException，记得要处理
 */

class StopThread implements Runnable{
	private boolean flag = true;
	public synchronized void run()
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		while(flag){
			System.out.println(Thread.currentThread().getName()+".....");
		}
	}
	public void setFlag()
	{
		flag = false;
	}
}

public class StopThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建线程任务对象
		StopThread st = new StopThread();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.start();
		//守护线程
		t2.setDaemon(true);
		t2.start();
		
		int num = 1;
		for (;;) {
			if (++num==50) {
//				st.setFlag();
				//执行清除任务
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println("main" + num);
		}
		System.out.println("over");
	}

}
