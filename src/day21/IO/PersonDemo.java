package day21.IO;

/*
 * 程序功能：IO字符流---装饰设计模式
 * 程序员：魏国平
 * 编写时间：12月26日
 */

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();

	}

}

class Person{
	void chifan(){
		System.out.println("吃饭");
	}
}

//这个类时为了增强Person而出现的。
class NewPerson{
	private Person person;
	
	public NewPerson(Person person) {
		// TODO Auto-generated constructor stub
		this.person = person;
	}
	
	void chifan(){
		System.out.println("开胃酒");
		person.chifan();
		System.out.println("甜点");
	}
}

//还可以使用extend使用覆盖增强
class NewPerson2 extends Person{
	
	void chifan(){
		System.out.println("开胃酒");
		System.out.println("吃饭");
		System.out.println("甜点");
	}
}