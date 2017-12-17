package day14;


/*
 * 程序功能：线程间通信
 * 程序员：魏国平
 * 编写时间：11月21日
 */

/*
 *线程间通讯：
 *多个线程在处理同一资源，但是任务却不同。 
 */

//资源
class Resource
{
	String name;
	String sex;
}

//输入
class Input implements Runnable
{

	Resource r;
	//构造函数Input
//	Object object = new Object();
	Input(Resource r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 0;
		while(true)
		{
			synchronized (r) {
				if (x==0) {
					r.name = "mile";
					r.sex = "nan";
				}
				else {
					r.name = "丽丽";
					r.sex = "女女女女女女";
				}
			}
			x = (x+1)%2;
			
			
		}
	}
	
}

//输出
class Output implements Runnable
{
	Resource r;
//	Object object = new Object();
	//构造函数Output
	Output(Resource r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(true)
			{
				synchronized (r) {
				System.out.println(r.name + "...." + r.sex);
				}
			}
	}
}


public class ResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建资源
		Resource r = new Resource();
		
		//创建任务
		Input input = new Input(r);
		Output output = new Output(r);
		
		//创建线程，执行路径。
		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);
		
		//开启线程
		t1.start();
		t2.start();
	}

}
