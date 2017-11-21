package day12;

/*
 * 程序功能:练习
 * 程序员:魏国平
 * 编写时间:11月16日
 */

interface Areable
{
	public double getArea();
}

class NoValueException extends RuntimeException
{
	public NoValueException() {
		// TODO Auto-generated constructor stub
		super();
	}
	NoValueException(String message)
	{
		super(message);
	}
}


class Rec implements Areable
{
	private int length;
	private int width;
	public Rec(int length, int width) {
		// TODO Auto-generated constructor stub
		if (length <= 0 || width <= 0) {
//			System.out.println("请跟我走一趟!!!!");
//			return ;
			throw new NoValueException("数值非法");
		}
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	
}

class Circle implements Areable
{

	private int radius;
	//因为这个数据共享并且不修改所以用static , final
	public static final double PI =3.14;
	
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		if (radius <= 0) {
			throw new NoValueException("半径值非法");
		}
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rec r = new Rec(3, -5);
		double a = r.getArea();
		System.out.println("area = " + a);*/
		Circle circle = new Circle(-7);
		double c = circle.getArea();
		System.out.println(c);
		
	}

}
