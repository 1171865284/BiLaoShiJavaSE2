package day16;

/*
 * 程序功能：基本数据类型对象包装类---自动拆箱装箱
 * 程序员：魏国平
 * 编写时间：12月6日
 */

public class WrapperDemo2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		num = num + 5;
		
		//自动装箱	简化书写
		Integer i = 4;//i = new Integer(4);1.4版本之前都这么用
		
		i = i+6;
		
//		show(55);
		
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		
		System.out.println(a==b);//flase
		System.out.println(a.equals(b));//true
		
		Integer x = 129;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会在开辟一个空间
		Integer y = 129;
		
		System.out.println(x==y);//true
		System.out.println(x.equals(y));//true
		
	}

	private static void show(int i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}

}
