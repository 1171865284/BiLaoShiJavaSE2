package day17.test;

import java.util.ArrayList;
import java.util.Iterator;

import day17.been.Person;

/*
 * 程序功能：ArrayList练习
 * 程序员：魏国平
 * 编写时间：12月10日
 */

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList();
		
		a1.add(new Person("list1", 21));
		a1.add(new Person("list2", 22));
		a1.add(new Person("list3", 23));
		a1.add(new Person("list4", 24));
		
		Iterator it = a1.iterator();
		
		while(it.hasNext())
		{
//			System.out.println(((Person) it.next()).getName()+"::"+((Person) it.next()).getAge());
			Person person = (Person) it.next();
			System.out.println(person.getName() + "--" + person.getAge());
		}
		
		a1.add(5);//a1.add(new Ineger(5));-----自动装箱
		
	}
}
