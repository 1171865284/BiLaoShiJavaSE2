package day18_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import day18.bean.Student;
import day18_2.bean.Person;
import day18_2.bean.Worker;

/*
 * 程序功能：通配符的演示
 * 程序员：魏国平
 * 编写时间：12月16
 * 
 * 无法运行的泛型限制
 */

/*
 * class TreeSet<Worker>
 * {
 * 		Tree(Comparator<? super Worker> comp);
 * }
 * 
 * 什么时候用下限呢?通常对集合中的元素进行取出操作时,可以使用下限.
 */
public class GenericAdvanceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Person> al1 = new 	TreeSet<Person>();
		
		al1.add(new Person("abc", 30));
		al1.add(new Person("abc4", 34));
		al1.add(new Person("abc1", 32));
		al1.add(new Person("abc5", 31));
		
		TreeSet<Student> al2 = new 		TreeSet<Student>();

		al2.add(new Student("stu1", 11));
		al2.add(new Student("stu2", 22));
		
		TreeSet<Worker> al3 = new 		TreeSet<Worker>();
		
		al3.add(new Worker("stu1", 11));
		al3.add(new Worker("stu1", 11));
		
		TreeSet<String> al4 = new 		TreeSet<String>();
		al4.add("abcdef");
//		al1.addAll(al4);//错误,类型不匹配
		
		
//		System.out.println(al1.size());
		
		Iterator<Person> it = al1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
//		printCollection(al);
//		printCollection(al2);
		
	}

}

/*
 * 
 */
class CompByName implements Comparable<Person>{

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class ComByStuName implements Comparator<day18_2.bean.Student>
{

	@Override
	public int compare(day18_2.bean.Student o1, day18_2.bean.Student o2) {
		// TODO Auto-generated method stub
		
//		int temp = o1.getName().compareTo(o2.getAge());
		
		return 0;
	}


	
}