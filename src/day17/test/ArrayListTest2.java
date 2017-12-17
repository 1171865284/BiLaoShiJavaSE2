package day17.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 程序功能：定义功能去除ArrayList中的重复元素
 * 程序员：魏国平
 * 编写时间：12月12日
 */

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc2");
		al.add("abc1");
		al.add("abc");
		System.out.println(al);
		
		al = getSinglsElement(al);
		
		System.out.println(al);
	}

	public static ArrayList getSinglsElement(ArrayList al) {
		// TODO Auto-generated method stub
		
		//1.定义一个临时容器。
		ArrayList temp = new ArrayList();
		
		//2.迭代al集合。
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			
			//3.判断被接待到的元素是否在临时容器存在。
			if(!temp.contains(obj))
			{
				temp.add(obj);
			}
		}
		
		return temp;
	}

}
