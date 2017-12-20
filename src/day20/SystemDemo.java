package day20;

import java.util.Properties;
import java.util.Set;

/*
 * 程序功能：System类的使用
 * 程序员：魏国平
 * 编写时间：12月19日
 */

/*
 * System:类中的方法和属性都是静态的。
 * 
 * 常见方法：
 * long currentTimeMillis();获取当前时间的毫秒值。
 */

public class SystemDemo {
	
	private static final String LINE_SEPARATOR = System.getProperty("LINE.SEPARATOR");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*long l1 = System.currentTimeMillis();
		System.out.println(l1);
		long l2 = System.currentTimeMillis();
		System.out.println(12-l1);*/
		
		System.out.println("hello-" + System.getProperty("LINE.SEPARATOR") + " world");
		
//		demo_1();
		
		//给系统设置一些属性信息。这些信息是全局,其他程序都可以使用。
		System.out.println(System.getProperty("Myclass", "Mypath"));
	}

	public static void demo_1() {
		// TODO Auto-generated method stub
		//获取系统的属性信息，并存储到了Properties集合中。
		/*
		 * properties集合中存储都时String类型的键值。
		 * 最好使用它自己的存储和取出的方法来完成元素的操作。
		 */
		Properties prop = System.getProperties();
		
		Set<String> nameSet = prop.stringPropertyNames();
		
		for(String name : nameSet){
			String value = prop.getProperty(name);
			
			System.out.println(name + "::" + value);
		}
		
	}

}
