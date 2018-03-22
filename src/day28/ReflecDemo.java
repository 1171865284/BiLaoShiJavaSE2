package day28;

/*
 * 程序功能：反射机制
 * 程序员：魏国平
 * 编写时间：3月21
 */

import day17.been.Person;

public class ReflecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReflecDemo_3();
	}

	/*
	 * 方式三：只要通过给定的类字符串名称就可以获取该类，更为扩展。
	 * 可用Class类中的方法完成，这个方法就是forName()。
	 * 这种方式只要有名称即可，更为方便，扩展性更强，但是需要带上类的包名。
	 */
	private static void ReflecDemo_3() {
		// TODO Auto-generated method stub
		String Str = "day28.bean.Person";
		try {
			Class c = Class.forName(Str);
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 方式二：任何数据类型都具备一个静态的属性.class来获取其对应的Class对象。相对简单，但是还是要明确类的类名。
	 * 这个是用静态成员。还是不够扩展。
	 */
	private static void ReflecDemo_2() {
		// TODO Auto-generated method stub
		Class<Person> class1 = Person.class;
		Class<Person> class2 = Person.class;
		System.out.println(class1 == class2);
	}

	/*
	 * 方式一：object类中的getClass()方法的。
	 * 想要用这种方式，必须要明确具体的类，并创建对象，比较麻烦。这个使用对象的方法。
	 */
	private static void ReflecDemo_1() {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Class class1 = p1.getClass();
		Person p2 = new Person();
		Class class2 = p2.getClass();
		System.out.println(class1 == class2);
	}

}
