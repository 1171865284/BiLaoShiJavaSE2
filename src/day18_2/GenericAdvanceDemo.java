package day18_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 程序功能：集合框架-泛型-泛型限定
 * 程序员：魏国平
 * 编写时间：12月16日
 */

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();

		al.add("abc");
		al.add("heh");

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(5);
		al2.add(65);

		printCollection(al);
		printCollection(al2);
	}

	/**
	 * 迭代并打印集合中的元素
	 * @param al
	 */
	public static void printCollection(Collection<?> al) {
		// 迭代器
		Iterator<?> it = al.iterator();

		// 迭代输出
		while (it.hasNext()) {
//			? str = it.next();
//			System.out.println(str);
			System.out.println(it.next().toString());
		}
	}

}
