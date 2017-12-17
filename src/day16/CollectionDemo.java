package day16;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 程序功能：集合框架---方法演示
 * 程序员：魏国平
 * 编写时间：12月7日
 */

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Collection coll = new ArrayList();
//		show(coll);
		
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		
		show(c1, c2);
	}

	public static void show(Collection c1, Collection c2)
	{
		//添加c1元素
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//添加c2元素
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		
		//演示addAll
		
//		c1.addAll(c2);//将c2中的元素添加到c1中
		
		//演示removeAll
		boolean b = c1.remove(c2);//将两个几个中的相同元素从调用removeAll集合中删除
		System.out.println("removeAll:" + b);
		
		System.out.println("c1:" + c1);
;	}
	
	public static void show(Collection coll)
	{
		//1.添加元素。add
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		//2.删除元素。remove
//		coll.remove("abc2");//会改变集合的长度
		
		//清空集合
//		coll.clear();
		int x = coll.size();
		
		System.out.println(x);
		
//		System.out.println(coll.contains("abc4"));
		
		System.out.println(coll);
	}
}
