package day20;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 程序功能：Date类-日期对象转成字符串
 * 程序员：魏国平
 * 编写时间：12月20日
 */

public class DateDemo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		methodDemo_3();
		
	}

	/**
	 * 将日期格式的字符串--》日期对象。
	 * 使用的是DateFormat类中的。
	 * @throws ParseException 
	 */
	
	public static void methodDemo_3() throws ParseException {
		// TODO Auto-generated method stub
		
		String str_date = "2012年4月19日";
		str_date = "2011--5--19";
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		
		dateFormat = new SimpleDateFormat("yyyy-MM--dd");
		
		Date date = dateFormat.parse(str_date);
		
		System.out.println(date);
	}

	/**
	 * 对日期对象进行格式化。
	 * 	将日期对象---》日期格式的字符串。
	 * 	使用的是DateFormat类中的format方法。
	 * 
	 * 
	 */
	public static void methodDemo_2() {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		//获取日期格式对象。具备着默认的风格。FULL LONG等制定风格
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		//如果风格是自定义的如何解决呢？
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String str_date = dateFormat.format(date);
		
		System.out.println(str_date);
	}

}
