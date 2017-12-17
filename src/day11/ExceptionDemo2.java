package day11;

/*
 * 程序功能:异常-原理&异常对象的抛出throw
 * 程序员:魏国平
 * 编写时间:11月12日
 */


public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null, -30);
		System.out.println("num = " + num);
		System.out.println("over");
	}

}

class Demo
{
	public int method(int [] arr, int index)
	{
		
		if (arr == null) {
			throw new NullPointerException("数组的引用不能为空！");
		}
		
		if (index >= arr.length)
		{
			//手动捕捉异常并抛出
			throw new ArrayIndexOutOfBoundsException("数组的角标越界了：：：：：：" + index);
		}
		
		
		return arr[index];
	}
}
