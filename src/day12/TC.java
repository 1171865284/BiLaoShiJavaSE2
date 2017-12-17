package day12;

/*
 * 程序功能:练习8
 * 程序员:魏国平
 * 编写时间:11月15日
 */

class TD
{
	int y = 6;
	class Inner
	{
		//static int y = 3;//编写失败因为非静态的内部类中不能定义静态的成员
		int y = 3;
		void show()
		{
			System.out.println(y);
		}
	}
}

public class TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TD.Inner ti = new TD().new Inner();
		ti.show();
	}

}
