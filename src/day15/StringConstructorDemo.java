package day15;

/*
 * 程序功能：String类---构造函数
 * 程序员：魏国平
 * 编写时间：12月3日
 */

/*
 * 
 */

public class StringConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConstructorDemo2();
	}

	private static void StringConstructorDemo2() {
		// TODO Auto-generated method stub
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr, 1, 3);
		
		System.out.println("s = " + s);
	}

	private static void StringConstructorDemo() {
		// TODO Auto-generated method stub
		String s = new String();//等效String s = "";	不等效String s = null;
		
		byte [] arr = {65, 66, 67, 68};
		
		String s1 = new String(arr);
		System.out.println("s1 = " + s1);
	}

}
