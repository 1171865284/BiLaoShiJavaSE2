package day6;

/*
 * 描述小汽车
 * 分析
 * 1.属性：
 * 		轮胎数
 * 		颜色
 * 2.行为
 * 		运行
 * 定义类就是在定义类中的成员
 * 成员：成员变量<--->属性，成员函数<-->行为。
 * 
 * 成员变量与局部变量的区别
 * 
 * 1.
 * 成员变量定义在类中，整个类中都可以访问
 * 局部变量定义在函数，语句，局部代码块，只有所属的区域有效
 * 
 * 2.
 * 成员变量存在于堆内存的对象中
 * 局部变量存在于栈内存的方法中
 * 
 * 3.
 * 成员变量随着对象的创建而存在，随着对象的消失而消失
 * 局部对象随着所属区域的执行而存在，随着所属区域的结束而释放
 * 
 * 4.
 * 成员变量都是默认初始值
 * 局部变量没有默认初始值
 */
class Car
{
	//属性
	int num;
	String color;
	//运行功能
	void run()
	{
		System.out.println(num + "....." + color);
	}
}


class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在计算机中创建一个car的实例，通过new关键字
		//car就是一个类类型的引用变量，指向了该类的对象
		Car car = new Car();
		car.num = 4;
		car.color = "red";
		car.run();
		
	}
}