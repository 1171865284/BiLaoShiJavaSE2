package day15;

/*
 * 程序功能：String类----intern方法
 * 程序员：魏国平
 * 编写时间：12月5日
 */

/*
 * intern():对字符串池进行操作的
 * 
 * 
 * 
 * 
 * 
 */

public class StringObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");//new的是两个对象一个new一个字符串对象在内存中
		String s2 = s1.intern();
		System.out.println(s1==s2);//flase
	}

}
