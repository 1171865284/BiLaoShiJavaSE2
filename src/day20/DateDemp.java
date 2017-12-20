package day20;

import java.util.Date;

/*
 * 程序功能：Date类的使用
 * 程序员：魏国平
 * 编写时间：12月20日
 */

/*
 * 日期对象和毫秒值之间的转换。
 * 
 * 毫秒值--》日期对象：
 * 	1.通过Date对象的构造方法 new  Date(timeMillis);
 * 	2.还可以通过setTime设置。
 * 	因为可以通过Date对象的方法对该日期中的各个字段（年月日等）进行操作。
 * 
 * 日期对象--》毫秒值：
 * 	2.getTime();
 * 因为可以通过具体的数值进行运算。
 */

public class DateDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*long time = System.currentTimeMillis();
		System.out.println(time);//1513739602098
		
		Date date = new Date();//将当前日期和时间封装成Date对象
		System.out.println(date);//Wed Dec 20 11:13:56 CST 2017
		
		Date date2 = new Date(1513739602098l);//将指定毫秒值封装成对象
		System.out.println(date2);*/
		
		Date date3 = new Date();
		date3.setTime(1513602098l);
		System.out.println(date3);
		
		Date date = new Date();
		date.getTime();
		System.out.println(date);
		
		
	}

}
