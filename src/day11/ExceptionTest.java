package day11;

/*
 * 程序功能:异常---异常应用
 * 程序员:魏国平
 * 编写时间:11月12日
 */

/*
 * 需求：
 * 毕老师用电脑上课。
 * 问题领域中涉及两个对象。
 * 毕老师,电脑。
 * 
 * 分析其中的问题。
 * 
 * 比如电脑蓝屏啦，冒烟啦。
 * 
 * 
 * class NoAddException
 * {}
 * 
 * void addData(Data d)
 * {
 * 		连接数据库
 * 		try
 * 		{
 * 			添加数据。出现异常	SQLException();
 * 		}
 * 		catch(SQLException e)
 * 		{
 * 			//处理代码。
 * 
 * 			throw new NoAddException();
 * 		}
 * 		finally
 * 		{
 * 			关闭数据库
 * 		}
 * }
 * 
 */
//两个自定义类
class LanPingException extends Exception
{
	public LanPingException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class MaoYanException extends Exception
{
	public MaoYanException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class NoPlanException extends Exception
{
	public NoPlanException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}

class Teacher
{
	private String name;
	
	private Computer computer;
	
	Teacher(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		computer = new Computer();
	}
	
	//老师的讲课功能
	//不处理故障无法讲课所以用try
	public void prelect() throws NoPlanException
	{
		try {
			computer.run();
		} catch (LanPingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			computer.reset();
			prelect();
		} catch (MaoYanException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			test();
			//可以对电脑进行维修
//			throw e;
			throw new NoPlanException("课时进度无法完成，原因" + e.getMessage());
		}
		
		System.out.println(name + "讲课");
	}
	
	//老师电脑冒烟了，要求学生们做练习
	public void test()
	{
		System.out.println("大家做练习吧，老师的电脑冒烟了！！！！");
	}
}

class Computer
{
	private int state = 2;
	public void run() throws LanPingException, MaoYanException
	{
		if(state == 1)
			throw new LanPingException("电脑蓝屏了");
		if(state == 2)
			throw new MaoYanException("电脑冒烟了");
		System.out.println("电脑运行");
	}
	
	//重启功能
	public void reset()
	{
		System.out.println("电脑重启");
	}
}

public class ExceptionTest {

	public static void main(String[] args) throws LanPingException, MaoYanException {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("毕老师");
		try {
			t.prelect();
		} catch (NoPlanException e) {
			// TODO: handle exception
			System.out.println(e.toString()+"........");
			System.out.println("换人");
		}
		
	}

}
