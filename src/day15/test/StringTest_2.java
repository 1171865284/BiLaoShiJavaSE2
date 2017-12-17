package day15.test;

/*
 * 程序功能：一个子串在整串中出现的次数。
 * "nbaernbatynbauinbaopnba"
 * 程序员：魏国平
 * 编写时间：12月5日
 */

/*
 * 思路：
 * 1.要找的子串是否存在，如果存在获取其出现的位置。这个可以使用indexOf完成。
 * 2.如果找到了，那么就记录出现的位置并在剩余的字符串中继续查找该子串。
 * 	而剩余字符串的起始位置+子串的长度。
 * 3.以此类推，通过循环完成查找。如果找不到就是-1，并对每次找到用计数器进行计数。
 */
public class StringTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nbaernbatynbauinbaopnba";
		String key = "nba";
		
		//方法一
//		int count = getKeyStringCount(str, key);
		int count = getKeyStringCount_2(str, key);
		System.out.println("count = " + count);
	}

	private static int getKeyStringCount_2(String str, String key) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(key, index)) != -1)
		{
			//找的是角标位置
			index = index + key.length();
			count++;
		}
		
		return count;
	}

	/**
	 * 获取子串在整串出现的次数
	 * @param str
	 * @param key
	 * @return
	 */
	public static int getKeyStringCount(String str, String key) {
		//1.定义计数器
		int count = 0;
		
		//2.定义变量记录key出现的位置
		int index = 0;
		
		while((index = str.indexOf(key)) != -1)
		{
			str = str.substring(index+key.length());
			count++;
		}
		
		return count;
	}

}
