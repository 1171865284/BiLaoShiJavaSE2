package day19.test;

import java.util.HashMap;
import java.util.Map;

/*
 * 程序功能：Map查表法
 * 程序员：魏国平
 * 编写时间：12月17日
 */

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Map集合在有映射关系时，可以优先考虑
		 * 
		 * 在查表法中的应用较为多见
		 */
		
		String week = getWeek(3);//输入的值时角标
		System.out.println(week);
		
		System.out.println(getWeekByMap(week));
	}
	
	public static String getWeekByMap(String week)
	{
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("星期一", "Mon");
		map.put("星期二", "Tus");
		map.put("星期三", "Wes");
		map.put("星期日", "Sun");
		map.put("星期天", "Sun");
		return map.get(week);
		
	}
	
	public static String getWeek(int week){
		
		if (week<0 || week>7) {
			throw new RuntimeException("没有对应的星期，请重新输入！");
			
		}
		
		//这是一个字符串数组
		String [] weeks = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
		
		return weeks[week];
	}

}
