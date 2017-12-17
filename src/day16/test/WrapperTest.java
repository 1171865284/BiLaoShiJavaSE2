package day16.test;

import java.util.Arrays;

/*
 * 程序功能：对一个字符串的数值进行从小到大的排序。
 * "20, 70, 9, -7, 88, 36, 29"
 * 程序员：魏国平
 * 编写时间：12月6日
 */

/*
 * 思路：
 * 1.排序
 * 2.如何获取到这个字符串中的这些需要排序的数值？
 * 发现这个字符串中其实都是空格来对数值进行分隔的。
 * 所以就想到用字符床对象的分割方法来将大串变成小串。
 * 3.数值最终变成小字符串，怎么变成一个int数呢？
 * 字符串--->基本类型可以使用包装类。
 */
public class WrapperTest {

	private static final String SPACE_SEPARATOR = " ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr = "20 70 9 -7 88 36 29";

		System.out.println(numStr);// 排序前
		numStr = sorStringNumber(numStr);
		System.out.println(numStr);// 排序后

	}

	public static String sorStringNumber(String numStr) {
		//1.将字符串变成字符串数组
		String[] str_arr = stringToArray(numStr);
		
		//2，将字符串数组变成int数组
		int[] num_arr = toIntArray(str_arr);
		
		//3.对int数组排序
		mySortArray(num_arr);
		
		//4.将排序后的int数组变成字符串
		String temp = arrayToString(num_arr);
		
		return temp;
	}

	//将排序后的int数组变成字符串
	public static String arrayToString(int[] num_arr) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		for (int x = 0; x < num_arr.length; x++) {
			if (x != num_arr.length-1) {
				sb.append(num_arr[x] + SPACE_SEPARATOR);
			}
			else {
				sb.append(num_arr[x]);
			}
		}
		
		
		return sb.toString();
	}

	//对数组进行排序
	public static void mySortArray(int[] num_arr) {
		// TODO Auto-generated method stub
		Arrays.sort(num_arr);
	}

	//将字符串数组变成int数组
	public static int[] toIntArray(String[] str_arr) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[str_arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		return arr;
	}

	/**
	 * @param numStr
	 * @return
	 */
	//将字符串变成字符串数组
	public static String[] stringToArray(String numStr) {
		String[] str_arr = numStr.split(SPACE_SEPARATOR);
		
		return str_arr;
	}

	
}
