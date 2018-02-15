package io;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pto = new Person();
//		pto.chifan();
		NewPerson p1 = new NewPerson(pto);
		p1.chifan();
	}

}

class Person{
	void chifan(){
		System.out.println("吃饭");
	}
}

//这个类就是为增加Person类存在的
class NewPerson{
	private Person p;
	public NewPerson(Person p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	void chifan(){
		System.out.println("开胃酒");
		p.chifan();
		System.out.println("甜点");
	}
}

class NewPerson2 extends Person{
	void chifan(){
		System.out.println("开胃酒");
		super.chifan();
		System.out.println("甜点");
	}
}