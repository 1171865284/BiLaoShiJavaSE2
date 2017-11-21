package day10;

/*
 * 程序功能:对象的多态性
 * 程序员:魏国平
 * 编写时间:111月9提
 */

/*
 * 对象的多态性
 * 
 * class 动物
 * {}
 * 
 * class 猫 extends 动物
 * {}
 * 
 * class 狗 extends 动物
 * {}
 * 
 * 猫 x = new 猫();
 * 动物 x = new 猫();
 * 
 * 猫着类事物即具备着猫的形态，又具备着动物的形态。
 * 这就是对象的多态性
 * 
 * 简单说：就是一个对象对应着不同类型。
 * 
 * 多态在代码中的体现：
 * 	父类或者接口的引用指向其子类的对象。
 * 
 * 多态的好处：
 * 	提高了代码的扩展性，前期定义的代码可以使用后期内容。
 * 
 * 多态的弊端：
 * 	前期定义的内容不能使用（调用）后期子类的特有内容
 * 
 * 多态的前提：
 * 	1.必须有关系，继承，实现
 * 	2.要有覆盖。
 */

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("啃骨头");
	}
	void lookHome()
	{
		System.out.println("看家");
	}
}

class Cat extends Animal
{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃鱼");
	}
	void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*method(new Cat());
		method(new Dog());*/
		/*Cat cat = new Cat();
		cat.eat();
		cat.catchMouse();*/
		Animal a = new Cat();//自动类型提升，猫对象提升了动物类型。
							//作用就是限制对特有功能的访问
							//专业将：向上转型。将子类型隐藏。就不用使用子类的特有方法
		a.eat();
		//如果还想用具体动物猫的特有功能。
		//你可以将该对象进行向下转型
		Cat cat = (Cat) a;//向下转型的目的是为了使用子类中的特有方法
		cat.eat();
		cat.catchMouse();
		
		/*
		 * 注意：对于转型，自始自终都是子类对象在做着类型的变化
		 * Animal a1 = new Dog();
		Cat c1 =  (Cat) a1;*/
	}
	
	public static void method(Animal a)
	{
		a.eat();
		if (a instanceof Cat) {
			Cat c = (Cat) a;
			c.catchMouse();
		}
		else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.lookHome();
		}
	}
}
