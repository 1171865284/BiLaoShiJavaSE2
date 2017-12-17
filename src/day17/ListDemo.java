package day17;

import java.util.ArrayList;
import java.util.List;

/*
 * 程序功能：list集合的常见方法。
 * 程序员：魏国平
 * 编写时间：12月9日
 */

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		// TODO Auto-generated method stub
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		
		//插入打印。
//		list.add(1, "abc9");
		
		//删除元素。
//		System.out.println("remove:" + list.remove(2));
		
		//修改元素。
//		System.out.println("set:" + list.set(1, "888"));
		
		//获取元素。
//		System.out.println("get:" + list.get(2));
		
		//获取子列表。-----顾首不顾尾
		System.out.println("sublist:" + list.subList(1, 2));
		
		System.out.println(list);
	}

}
