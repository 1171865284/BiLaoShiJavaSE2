package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 程序功能：集合框架---迭代器的使用
 * 程序员：魏国平
 * 编写时间：12月7日
 */

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection coll = new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		System.out.println(coll);
		
		//使用了Collection中的iterator()方法，调用了集合中迭代器方法。是为了获取集合中的迭代器对象。
//		Iterator it = coll.iterator();
//		System.out.println(it.next());
		
		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		for(Iterator it = coll.iterator(); it.hasNext(); )
		{
			System.out.println(it.next());
		}
	}

}
