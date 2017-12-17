package day17.been;

/*
 * 程序功能：自定义对象
 * 程序员：魏国平
 * 编写时间：12月10日
 */

public class Person /*extends Object*/ implements Comparable {

	private String name;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	//构造器
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
//		System.out.println(this + "....hasCode");
		return name.hashCode()+age*25;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this == obj)
		{
			return true;
		}
		if(!(obj instanceof Person))
		{
			throw new ClassCastException("类型不对");
		}
		
//		System.out.println(this + "...equals.." + obj);
		Person p = (Person) obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Person p = (Person) o;

		//排序年龄
		int temp = this.age - p.age;
		return temp == 0 ? this.name.compareTo(p.name):temp;
		
		//按照姓名排序
//		int temp = this.name.compareTo(p.name);
//		return temp == 0?this.age-p.age:temp;
		
//		return this.age - p.age;
		
		//
		
		/*if(this.age > p.age)
		{
			return 1;
		}
		
		if (this.age < p.age) {
			return -1;
		}
		
		else {
			return this.name.compareTo(p.name);
		}*/
	}
	

}
