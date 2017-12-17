package day10;

import day10.Outer.Inner;

/*
 * 程序功能:匿名内部类--应用
 * 程序员:魏国平
 * 编写时间:11月11日
 */

interface Inter
{
	void show1();
	void show2();
}

class Outer5
{
	/*class Inner implements Inter
	{

		@Override
		public void show1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void show2() {
			// TODO Auto-generated method stub
			
		}
		
	}*/
	
	public void method()
	{
//		Inner inner = new Inner();
//		inner.show1();
//		inner.show2();
		
		Inter inter = new Inter() {
			
			@Override
			public void show2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void show1() {
				// TODO Auto-generated method stub
				
			}
			
			public void show3()
			{
				
			}
		};
		inter.show1();
		inter.show2();
	}
}

/*
 * 通常的实用场景之一
 * 当函数参数时接口类型时，而且接口中打方法不超过三个
 * 可以用匿名内部类作为实际参数进行传递
 */
public class InnerClassDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new Inter() {
			
			@Override
			public void show2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void show1() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void show(Inter inter)
	{
		inter.show1();
		inter.show2();
	}

}
