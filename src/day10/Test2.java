package day10;

class Fu5
{
	
	Fu5() {
		// TODO Auto-generated constructor stub
		System.out.println("fu first run");
		show();
	}
	void show()
	{
		System.out.println("heheh");
	}
}

class Zi5 extends Fu5
{
	int num = 9;
	
	{
		System.out.println("constructor code....." + num);
		num = 10;
	}
	
	Zi5() {
		super();
		System.out.println("zi constructor......" + num);
	}
	
	void show()
	{
		System.out.println("show....." + num);
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi5();
	}

}
