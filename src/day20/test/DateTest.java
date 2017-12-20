package day20.test;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import day10.Test;

/*
 * 程序功能：练习：2012-3-17到2012-4-6，中间有多少天。
 * 程序员：魏国平
 * 编写时间：12月20日
 */

/*
 * 思路：
 * 两个日期相减就可以了
 * 但是怎么减呢？
 * 必须要有两个减法运算的数。
 * 能减可以是毫秒值。如何获取毫秒值？通过date对象。
 * 如何获取date对象呢？可以将字符串转成date对象。
 * 
 * 1.将日期格式的字符串转成Date对象。
 * 2.将Date对象转成毫秒值。
 * 3.相减再变成天数。
 */

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String str_date1 = "2012-1-1";
		String str_date2 = "2012-1-31";
		test(str_date1, str_date2);

	}

	private static void test(String str_date1, String str_date2) throws ParseException {
		// TODO Auto-generated method stub

		// 1.将日期字符串转成日期对象。
		// 定义日期格式对象。
		DateFormat dateFormat = DateFormat.getDateInstance();
		//自定义日期时间的格式
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		//得到两个date对象
		Date date1 = dateFormat.parse(str_date1);
		Date date2 = dateFormat.parse(str_date2);

		// 将日期转换成为毫秒值
		long time1 = date1.getTime();
		long time2 = date2.getTime();
		long time = Math.abs(time1 - time2);

		// 使用了绝对值的方法abs
//		int day = getDay(time);

		String week = getWeek(getDay(time));
		
		System.out.println(week);


	}

	private static String getWeek(int day) {
		// TODO Auto-generated method stub

		int weeks = day%7;
		String week = null;
		switch (weeks) {
		case 1:
			return week="一";
		case 2:
			return week="二";
		case 3:
			return week="三";
		case 4:
			return week="四";
		case 5:
			return week="五";
		case 6:
			return week="六";
		case 7:
			return week="日";
		

		default:
			break;
		}

	
		return week;
	}

	private static int getDay(long time) {
		// TODO Auto-generated method stub

		int day = (int) (time / 1000 / 60 / 60 / 24);

		return day;
	}

}
