package day5;

/*
 * 程序功能:查表法
 * 程序员:魏国平
 * 编写时间:11月1日
 */
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String week = getWeek(4);
		System.out.println(week);
	}

	/*
	 * 使用查表法
	 * 星期*
	 * String s = "abc";
	 * int x = 3;
	 * 
	 */
	public static String getWeek(int num)
	{
		if (num > 7 || num < 1) {
			return "错误的星期";
		}
		String [] weeks = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		return weeks[num];
	}
}
