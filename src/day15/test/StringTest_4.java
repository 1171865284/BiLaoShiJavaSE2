package day15.test;

/*
 * 程序功能：模拟一个trim功能一致的方法。
 * 程序员：魏国平
 * 编写时间：12月5日
 */

/*
 * 思路：
 * 1.定义两个变量。
 * 一个变量作为从头开始判断字符串空格的角标。不断++
 * 一个变量作为从为开始判断字符串空格的角标。不断--
 * 2.判断到不是空格为止，去头尾之间的字符串即可。
 */

public class StringTest_4 {

	public static void main(String[] args) {
		String s = "   ab   c     ";

		s = myTrim(s);
		System.out.println("-" + s + "-");
	}

	private static String myTrim(String s) {
		// TODO Auto-generated method stub

		int start = 0, end = s.length()-1;

		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		while (start <= end && s.charAt(end) == ' ') {
			end--;
		}

		return s.substring(start, end + 1);
	}

}
