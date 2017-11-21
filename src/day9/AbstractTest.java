package day9;

/*
 * 程序功能:雇员示例：
 * 需求：公司中程序员的姓名，功号，薪水，工作内容
 * 项目经理处理姓名，工号，薪水，还有奖金，工作内容。
 * 对给出需求进行数据建模
 * 
 * 程序员:魏国平
 * 
 * 编写时间:11月8日
 */

/*
 * 分析：
 * 在这个问题中，先找出涉及的对象。
 * 通过名词提炼法。
 * 程序员：
 * 	属性：姓名，工号，薪水
 * 	行为：工作
 * 经理：
 * 	属性:姓名，工号，薪水，奖金
 * 	行为：工作
 * 
 * 程序员和经理不存在着直接继承关系
 * 
 * 但是程序员和经理却具有共享内容。
 * 可以进行抽取。因为他们都是公司的雇员
 * 
 * 可以江程序员和经理进行抽取，及那里体系
 */

//描述雇员
abstract class Employee
{
	//雇员的基本属性为父类姓名，工号，薪水
	private String name;
	private String id;
	private double pay;
	Employee(String name, String id, double pay) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public  abstract void work();
}

//描述程序员
class Programmer extends Employee
{
	//子类继承抽象父类
	Programmer(String name, String id, double pay) {
		super(name, id, pay);
		// TODO Auto-generated constructor stub
	}
	
	//继承父类方法
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("code..........");
	}
	
}

//描述经理
class Manager extends Employee
{	
	//添加奖金
	private int bonus;
	Manager(String name, String id, double pay, int bonus) {
		super(name, id, pay);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	//方法
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("magen.....");
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}