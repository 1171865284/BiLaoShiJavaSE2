package day28;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 程序功能：方法的访问
 * 程序员：魏国平
 * 编写时间：3月21日
 */

public class ReflecDemo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		getMethod_2();
	}

	private static void getMethod_3() throws Exception {
		// TODO Auto-generated method stub
		//寻找class文件名称，并产生Class对象
		Class clazz = Class.forName("day28.bean.Person");
		
		Method method = clazz.getMethod("pasMethod", String.class,int.class);
		
		Object obj = clazz.newInstance();
		
		method.invoke(obj, "小红",99);
	}

	//拿无参构造
	private static void getMethod_2() throws Exception {
		// TODO Auto-generated method stub
		//寻找class文件名称，并产生Class对象
		Class clazz = Class.forName("day28.bean.Person");
		
		Method method = clazz.getMethod("show", null);
		
		//创建一个新的对象使用newInstance()方法
//		Object obj = clazz.newInstance();
		Constructor constructor = clazz.getConstructor(String.class, int.class);
		Object obj = constructor.newInstance("小米",12);
		method.invoke(obj, null);
	}

	//访问这个class文件中的所有方法
	private static void getMethod_1() throws Exception {
		// TODO Auto-generated method stub
		
		//寻找class文件名称，并产生Class对象
		Class clazz = Class.forName("day28.bean.Person");
		
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods){
			System.out.println(method);
		}
		
	}

}
