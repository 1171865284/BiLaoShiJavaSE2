package day28;

import java.lang.reflect.Field;

/*
 * 程序功能：字段的访问
 * 程序员：魏国平
 * 编写时间：3月21日
 */

public class ReflecDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getField();
	}

	//获取字节码的字段，使用getField()
	private static void getField() throws Exception {
		// TODO Auto-generated method stub
		
//		String name = "day28.bean.Person";
		
		Class clazz = Class.forName("day28.bean.Person");
		
		Field field = clazz.getDeclaredField("age");
		
		System.out.println(field);
		
		
	}

}
