package day20;

import java.time.Year;

/*
 * 程序功能：Calendar类的使用---日历类
 * 程序员：魏国平
 * 编写时间：12月20日
 */

/*
 * 1.写一个功能任何一年的二月有多少天
 * YEAR, MONTH, DAY_OF_MONTH
 */
import java.util.Calendar;

//写一个功能任何一年的二月有多少天
public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		int year = 1999 ;
		
		showDys(year);
	}

	/**
	 * @param c
	 */
	//此方法是实现人格一年的二月有多少天
	public static void showDys(int year) {
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		showDate(c);
	}

	/**
	 * @param c
	 */
	//输出年月日和星期
	public static void showDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+"年"+month+"月"+day+"日"+getWeek(week));
	}

	//输出字符串星期
	public static String getWeek(int i) {
		// TODO Auto-generated method stub
		
		String[] weeks = {"","星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		return weeks[i];
	}

	
}
