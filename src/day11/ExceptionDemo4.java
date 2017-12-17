package day11;

/*
 * 程序功能:异常的捕捉
 * 程序员:魏国平
 * 编写时间:11月12日
 */

/*
 * 异常处理的捕捉形式
 * 这是可以对异常进行针对性处理的方式。
 * 
 * 具体格式
 * 
 * try
 * {
 * 		//需要被检查异常的代码
 * }
 * catch(异常类 变量)//该变量用于接收发生的异常对象
 * {
 * 		//处理异常的代码
 * }
 * finally
 * {
 * 		//一定会被执行的代码
 * }
 * 
 * toString:把对象变成字符串
 * 
 * 异常处理原则：
 * 1.函数内部如果抛出需要检测的异常，那么函数上必须要声明/
 * 	否者必须在函数内用try{}---catch(){}捕捉，否则编译失败。
 * 
 * 2.如果调用到了声明异常的函数，要么try{}---catch(){}要么throes，否者编译失败
 * 
 * 3.什么时候catch，什么时候throws呢？
 * 	功能内部可以解决，用catch。
 * 	解决不了，用throws告诉调用者，用调用者解决。
 * 
 * 4.一个功能如果抛出了多个异常，那么调用是，必须有对应多个catch进行针对性的处理。
 * 	内部有几个需要检测的异常，就抛几个异常，抛出几个，就catch几个
 */
public class ExceptionDemo4 {

	public static void main(String[] args)
	{
		int [] arr = new int[3];
		Demo4 d = new Demo4();
		try {
			int num = d.method(null, -30);
			System.out.println("num = " + num);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		catch (FuShuIndexException4 e) {
			// TODO Auto-generated catch block
			System.out.println("message:" + e.getMessage());
//			e.printStackTrace();//jvm默认的异常处理机制就是异常对象的这个方法
			System.out.println("string:"+e.toString());
			System.out.println("数组角标异常！！！");
		}
		/*catch (Exception e)//多catch父类的catch放在最下面
		 * {
			// TODO: handle exception
			 * 
		}*/
		
		System.out.println("over");
	}

}

class Demo4
{
	public int method(int [] arr, int index) throws FuShuIndexException4 
	{
		if(arr == null)
			throw new NullPointerException("没有任何数组实体");
		if (index < 0) {
			throw new FuShuIndexException4("角标变成负数啦！！！");
		}
		
		return arr[index];
	}
}

class FuShuIndexException4 extends Exception
{
	FuShuIndexException4() {
		// TODO Auto-generated constructor stub
	}
	
	FuShuIndexException4(String msg)
	{
		super(msg);
	}
}