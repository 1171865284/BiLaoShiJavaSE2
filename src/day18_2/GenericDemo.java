package day18_2;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 程序功能：集合框架---泛型
 * 程序员：魏国平
 * 编写时间：12月15日
 */

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		al.add("abc2");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String str =  it.next();
			System.out.println(str);
		}
	}

}
