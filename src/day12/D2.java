package day12;

/*
 * 程序功能:练习
 * 程序员:魏国平
 * 编写时间:11月15日
 */
interface A2
{
	void show();
}
 interface B2
 {
	 void add(int a, int b);
 }

 class C2 implements A2, B2
 {

	 private int x, y;
	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}
	 
 }
public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c = new C2();
		c.add(4, 2);
		c.show();
	}

}
