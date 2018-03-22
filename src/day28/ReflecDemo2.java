package day28;

/*
 * 程序功能：获取字节码文件中的构造函数
 * 程序员：魏国平
 * 编写时间：3月21日
 */

import java.lang.reflect.Constructor;

public class ReflecDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		createNewObject_2();
	}

	private static void createNewObject_2() throws Exception {
		// TODO Auto-generated method stub
		String name = "day28.bean.Person";
		Class clazz = Class.forName(name);
		//获取对象并实例化对象
		Constructor constructor = clazz.getConstructor(String.class, int.class);
		//通过构造器的对象的newInstance()方法，使对象初始化
		Object object = constructor.newInstance("小米", 9);
	}

	private static void createNewObject() {
		// TODO Auto-generated method stub
		
		String name = "day28.bean.Person";
		try {
			Class clazz = Class.forName(name);
			try {
				Object obj = clazz.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
