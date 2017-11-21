package day12;

interface A{}

class B implements A
{
	public String func()
	{
		return "func";
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A a = new B();
		System.out.println(a.func());
		编译失败，因为a所属的A接口没有定义func()方法*/
	}

}
