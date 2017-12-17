package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * 程序功能：ListIterator接口
 * 程序员：魏国平
 * 编写时间：12月9日
 */

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
//		show(list);
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		//获取列表迭代器对象
		ListIterator it = list.listIterator();
		
		//它可以实现在迭代过程中完成对元素的增删改查
		//注意：只有list集合具备该迭代功能。
		while(it.hasNext())
		{
			Object obj = it.next();
			
			if(obj.equals("abc2"))
			{
				it.set("abc9");
			}
		}
		
		while(it.hasPrevious())
		{
			System.out.println("previous:" + it.previous());
		}
		
		/*//获取该迭代器的容器
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			Object obj = iterator.next();
			
			//在迭代过程中，不要使用集合操作元素，容易出现异常。
			//可以使用Iterator接口的子接口ListIterator来完成在迭代中进行更多的操作。
			if(obj.equals("abc2"))
			{
				list.add("abc9");
			}
			else {
				System.out.println("next:" + obj);
			}
		}*/
		
		System.out.println("list" + list);
	}

	public static void show(List list) {
		// TODO Auto-generated method stub
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println("next:" + iterator.next());
		}
		
		//list特有的取出元素的方式之一。
		for(int x = 0; x < list.size(); x++){
			System.out.println("get:" + list.get(x));
		}
	}

}
