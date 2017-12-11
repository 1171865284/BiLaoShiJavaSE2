package day17;

/*
 * 程序功能：LinkedList的使用
 * 程序员：魏国平
 * 编写时间：12月10日
 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link);
//		System.out.println(link.getFirst());//获取第一个但不删除
//		System.out.println(link.getFirst());
		
//		System.out.println(link.removeFirst());//获取元素但是会删除
//		System.out.println(link.removeFirst());
		
		while(!link.isEmpty()){
			System.out.println(link.removeFirst());
		}
		
		System.out.println(link);
		
//		Iterator it = link.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
	}

}

/**
 * 运行结果:
 * abc4
 * abc3
 * abc2
 * abc1
 * addFirst添加到头部位
 * */
