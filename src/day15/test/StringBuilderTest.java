package day15.test;

/*
 * 程序功能：将int数组变成字符串
 * 程序员：魏国平
 * 编写时间：12月6日
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 5, 3, 8};
		
		String s = arrayToString_2(arr);
		
		System.out.println(s);
	}
	
	private static String arrayToString_2(int[] arr) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) {
				sb.append(arr[i] + ", ");
			}
			else {
				sb.append(arr[i] + "]");
			}
		}
		
		return sb.toString();
	}

	public static String arrayToString(int[] arr)
	{
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) {
				str += arr[i] + ",";
			}
			else {
				str += arr[i] + "]";
			}
		}
		
		return str;
	}
}
