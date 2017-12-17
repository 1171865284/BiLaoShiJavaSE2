package day17;

import java.util.Iterator;
import java.util.TreeSet;

import day17.been.ComparatorByName;
import day17.been.Person;

/*
 * 程序功能：
 * 程序员：魏国平
 * 编写时间：12月13日
 */

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//有指定顺序，按照元素表排序
		TreeSet ts = new TreeSet(new ComparatorByName());
		
		/*
		 * 以Person对象年龄从小到大的排序
		 * 如果想把从小到大改为从大到小可以把（-1改为1，1改为-1）
		 */
		
		ts.add(new Person("zhangsan", 21));
		ts.add(new Person("lisi", 21));
		ts.add(new Person("wangwu", 23));
		ts.add(new Person("zhaoliu", 24));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			
			Person p = (Person) it.next();
			
			System.out.println(p.getName() + "...." + p.getAge());
		}
	}

	/**
	 * 
	 */
	public static void demo1() {
		TreeSet ts = new TreeSet();
		
		ts.add("abc");
		ts.add("aa");
		ts.add("nba");
		ts.add("cba");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
