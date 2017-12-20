package day20;

import java.io.IOException;

/*
 * 程序功能：RunTime的使用
 * 程序员：魏国平
 * 编写时间：12月19日
 */

/*
 * RunTime:没有·构造方法摘要，说明该类不可以创建对象。
 * 又发现还有非静态的方法。说明该类应该提供静态的返回该类的方法。
 * 而且只有一个，说明RunTime类使用了单例设计模式。
 */

public class RunTimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		
//		execute:执行。xxx.exe
		//执行记事本应用
		Process p = r.exec("notepad.exe");
		//五秒钟睡眠e
		Thread.sleep(5000);
		//关闭进程
		p.destroy();
		
		
	}

}
