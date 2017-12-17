package day14;


/*
 * 程序功能：等待线程机制----优化
 * 程序员：魏国平
 * 编写时间：11月22日
 */


//资源
class Resource3
{
	private String name;
	private String sex;
	boolean flag = false;
	
	//同步函数,封装了我们需要的方法
	public synchronized void set(String name, String sex)
	{
		if(flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	
	//同步函数,封装了我们需要的方法
	public synchronized void out()
	{
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(name + "..+." + sex);
		flag = false;
		
		this.notify();
	}
}

//输入
class Input3 implements Runnable
{

	Resource3 r;
	//构造函数Input
//	Object object = new Object();
	Input3(Resource3 r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		while(true)
		{
				if (x==0) {
					r.set("mike", "nan");
				}
				else {
					r.set("丽丽", "女女女女");
				}
				//这句代码使while循环达到交叉输出效果
				x = (x+1)%2;
			}
		}
	}

//输出
class Output3 implements Runnable
{
	Resource3 r;
//	Object object = new Object();
	//构造函数Output
	Output3(Resource3 r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(true)
			{
				r.out();
			}
	}
}


public class ResourceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建资源
		Resource3 r = new Resource3();
		
		//创建任务
		Input3 input = new Input3(r);
		Output3 output = new Output3(r);
		
		//创建线程，执行路径。
		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);
		
		//开启线程
		t1.start();
		t2.start();
	}

}
