package day11;

/*
 * 程序功能:Object类-equals方法
 * 程序员:魏国平
 * 编写时间:11月13
 */

/*
 * 
 */

/*class Fu4
{
	public Fu4() {
		// TODO Auto-generated constructor stub
		super();
	}
}

class Zi4 extends Fu4
{
	public Zi4() {
		// TODO Auto-generated constructor stub
		super();
	}
}*/

class Person
{
	private int age;
	public Person(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}
	//比较Person的年龄。是否是同龄人
	public boolean compare(Person p)
	{
		return this.age == p.age;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * 一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据。
	 */
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Person)) {
//			return false; 
			throw new ClassCastException("类型错误");
		}
		Person p = (Person) obj;
		return this.age == p.age;
		
	}
	
	public int hashCode()
	{
		return age;
		
	}
	
}

class Demo6
{
	
}

class Class
{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		Demo6 d = new Demo6();
		
//		System.out.println(p1.equals(p2));
		
		System.out.println(p1);
//		System.out.println(p1.hashCode());
//		Person p3 = p1;
		
//		Demo6 d = new Demo6();
		
		//比较对象，地址
//		System.out.println(p1==p2);
//		System.out.println(p1.equals(p2));
	}

}