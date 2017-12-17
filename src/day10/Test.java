package day10;

class Fu4
{
	Fu4() {
		// TODO Auto-generated constructor stub
		show();
	}
	
	void show()
	{
		System.out.println("hehehe");
	}
}

class Zi4 extends Fu4
{
	int num = 9;
	Zi4() {
		// TODO Auto-generated constructor stub
		super();
		//显示初始化
		System.out.println("zi constructor....." + num);
	}
	
	void show()
	{
		System.out.println("show ....." + num);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Zi4();
	}

}
