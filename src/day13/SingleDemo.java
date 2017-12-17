package day13;

/*
 * 程序功能：单例设计模式涉及的多线程问题
 * 程序员：魏国平
 * 编写时间：11月20日
 */

//饿汉模式
class Single
{
	private static Single single =null;
	
	private Single(){}
	
	//加同步函数,为了提高效率所以同步代码块
	public static /*synchronized*/ Single getInstance()
	{
		if (single == null) {
			//同步代码块
			synchronized (Single.class) {
				if (single == null) {
					single = new Single();
				}
			}
		}
		return single;
	}
}

//懒汉模式
public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
