package day15.test;

/*
 * 程序功能：两个字符串中最大相同的子串。
 * 程序员：魏国平
 * 编写时间：12月5日
 */

/*
 * 思路：
 * 1.既然取得是最大子串，先看短的那个字符串是否在长的那个字符串中。
 * 	如果存在，多纳德那个字符串就是最大字符串。
 * 2.如果不是呢，那么就是将短的那个子串进行长度递减的方式却子串，去长串中判断是否存在。
 * 如果存在就以找到，就不用再找了。
 */
public class StringTest_3 {

	public static void main(String[] args) {
		String s1 = "qwerabcdtyuiop";
		String s2 = "xcabcdvbn";

		String s = getMaxSubstring(s1, s2);
		System.out.println("s = " + s);
	}

	/**
	 * 获取最大子串
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String getMaxSubstring(String s1, String s2) {

		String max = null, min = null;
		max = (s1.length() > s2.length()) ? s1 : s2;

		min = max.equals(s1) ? s2 : s1;

		System.out.println("max=" + max);
		System.out.println("min=" + min);

		for (int i = 0; i < min.length(); i++) {

			for (int a = 0, b = min.length() - i; b != min.length() + 1; a++, b++) {

				String sub = min.substring(a, b);
				// System.out.println(sub);
				if (max.contains(sub))
					return sub;
			}
		}

		return null;
	}
}
