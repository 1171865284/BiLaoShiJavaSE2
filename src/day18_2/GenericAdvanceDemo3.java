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

public class GenericAdvanceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> al1 = new ArrayList<Person>();
		
		al1.add(new Person("abc", 30));
		al1.add(new Person("abc4", 34));
		
		ArrayList<Student> al2 = new ArrayList<Student>();

		al2.add(new Student("stu1", 11));
		al2.add(new Student("stu2", 22));
		
		ArrayList<Worker> al3 = new ArrayList<Worker>();
		
		al3.add(new Worker("stu1", 11));
		al3.add(new Worker("stu1", 11));
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("abcdef");
//		al1.addAll(al4);//错误,类型不匹配
		
		
		System.out.println(al1.size());
		
		
		
//		printCollection(al);
//		printCollection(al2);
		
	}

}

/*
 * 一般在存储元素的时候都是用上限，因为这样去除都是按照上限类型来运算的不会出现类型安全隐患
 * 
 */
class MyCollection<E>{
	public void add(E e){
		
		
	}
	
	public void addAll(MyCollection<? extends E> e){
		
	}
}
