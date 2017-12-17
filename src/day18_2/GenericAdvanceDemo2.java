package day18_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day18.bean.Student;
import day18_2.bean.Person;
import day18_2.bean.Worker;

/*
 * 程序功能：通配符的演示
 * 程序员：魏国平
 * 编写时间：12月16
 */

public class GenericAdvanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Worker> al = new ArrayList<Worker>();
		
		al.add(new Worker("abc", 30));
		al.add(new Worker("abc4", 34));
		
		ArrayList<Student> al2 = new ArrayList<Student>();

		al2.add(new Student("stu1", 11));
		al2.add(new Student("stu2", 22));

		printCollection(al);
		printCollection(al2);
		
	}

	/**
	 * 迭代并打印集合中的元素
	 * 
	 * 可以对类型进行限定：
	 * ? extends E:接收E类型或者E的子类型对象。上限！
	 * 
	 * ? super E: 接收E类型或者E的父类型。下限！
	 * @param al2
	 */
	//只接收Person类中的子类和Person
//	public static void printCollection(Collection<? extends Person> al) {

	public static void printCollection(Collection<?> al) {
		// 迭代器
		Iterator<?> it = al.iterator();

		// 迭代输出
		while (it.hasNext()) {
//			? str = it.next();
//			System.out.println(str);
			System.out.println(it.next().toString());
		}
	}

}
