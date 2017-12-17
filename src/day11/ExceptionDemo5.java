package day11;

/*
 * 程序功能:异常---finally代码块
 * 程序员:魏国平
 * 编写时间:11月12日
 */

/*
 * 连接数据库。
 * 查询。Exception
 * 关闭连接。
 * 
 * 关闭数据库是我们以后一定要做的动作之一
 * 
 * try catch finally 代码块组合特点：
 * 
 * 1.try catch finally
 * 
 * 2.try catch(多个)当没有必要资源需要释放是，可以不用定义finally.
 * 
 * 3.try finally 异常无法直接catch处理，但是资源需要关闭。
 * 
 *
 * void show()//throws Exception
 * {
 * 		try
 * 		{
 * 			//c开启资源
 * 			throw new Exception();
 * 		}
 * 		finally
 * 		{
 * 			//关闭资源
 * 		}
 * }
 */

class Demo5
{
	public int show(int index)
	{
		if(index < 0)
			throw new ArrayIndexOutOfBoundsException("越界啦");
		int [] arr = new int[3];
		return arr[index];
	}
}

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d = new Demo5();
		try {
			int num = d.show(-3);
			System.out.println("num = " + num);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
//			return;//直接结束了程序
//			System.exit(0);//退出jvm
		}
		finally//finally是一定会执行的代码,通常用于关闭（释放）资源
		{
			System.out.println("finally");
		}
		System.out.println("over");
	}

}
