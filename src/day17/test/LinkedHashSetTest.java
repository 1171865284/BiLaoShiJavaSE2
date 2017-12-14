package day17.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 程序功能：LinkedHashSet集合
 * 程序员：魏国平
 * 编写时间：12月13日
 */

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new LinkedHashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
