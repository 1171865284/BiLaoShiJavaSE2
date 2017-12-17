package day10;

/*
 * 程序功能:多态转型的使用
 * 程序员:魏国平
 * 编写时间:11月9日
 */

class Fu
{
	void teach()
	{
		System.out.println("管理");
	}
	void fishing()
	{
		System.out.println("钓鱼");
	}
}

class Zi extends Fu
{
	void teach()
	{
		System.out.println("Java");
	}
	void movie()
	{
		System.out.println("看电影");
	}
}

public class DuoTaiDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		毕老师 x = new 毕老师();
//		x.讲课();
//		x.看电影();
//		Type mismatch: cannot convert from 毕老师 to 毕姥爷
		Fu x = new Zi();
		x.teach();
		x.fishing();
		
		Zi y = (Zi) x;
		y.movie();
	}

}
