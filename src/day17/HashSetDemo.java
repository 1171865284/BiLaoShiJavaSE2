package day17;

/*
 * 程序功能：HashSet集合
 * 程序员：魏国平
 * 编写时间：12月11日
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//保证集合的唯一性
		HashSet hs = new HashSet();
		
		hs.add("1");
		hs.add("2");
		hs.add("3");
		hs.add("4");
		//存再多也没有用不会重复，因为有唯一性
		hs.add("1");
		hs.add("1");
		hs.add("1");
		hs.add("1");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
