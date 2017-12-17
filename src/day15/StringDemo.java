package day15;

/*
 * 程序功能：String类的初步学习---String类的特点
 * 程序员：魏国平
 * 编写时间：12月3日
 */

/*
 * String类的特点：
 * 字符串对象一旦初始化就不会被改变。
 * String类中equals复写Object中的equals建立了String类自己的判断字符串对象是否相同的依据
 */

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo2();
	}

	private static void StringDemo2() {
		// TODO Auto-generated method stub
		//在常量池中创建一个对象
		String s = "abc";
		//创建两个对象一个new一个字符串对象在对内存中
		String s1 = new String("abc");
		
//		System.out.println("s = " + s);
//		System.out.println("s1 = " + s1);
		
		//比较的地址
		System.out.println(s1==s);//flase
		
		//比较的内容
		//String类中equals复写Object中的equals建立了String类自己的判断字符串对象是否相同的依据
		//其实就是比较字符串内容
		System.out.println(s.equals(s1));
		
	}

	/**
	 * 演示字符串定义的第一种方式，并明确自负床常量池的特点。
	 * 池中没有就建立，池中有，直接用。
	 */
	private static void StringDemo1() {
		String s = "abc";//"abc"存储在字符串常量池中。
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);
//		System.out.println("s = " + s);
	}

}
