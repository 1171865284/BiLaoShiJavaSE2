package day17.test;

import java.util.HashSet;
import java.util.Iterator;

import day17.been.Person;

/*
 * 程序功能：HashSet存储自定义对象
 * 程序员：魏国平
 * 编写时间：12月12日
 */

/*
 * 往hashSet集合中存储Person对象。如果姓名和年龄相同，视为同一元素
 * 
 * HashSet集合数据结构是哈希表，所有寻出元素的时候。
 * 使用的元素的hashCode方法来确定位置，如果位置相同在童工元素的equals方法来确定。
 * 
 */

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		
		hs.add(new Person("list4", 24));
		hs.add(new Person("list7", 27));
		hs.add(new Person("list1", 21));
		hs.add(new Person("list1", 21));
		hs.add(new Person("list9", 29));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person person = (Person) it.next();
			System.out.println(person.getName() + "::" + person.getAge());
		}
	}

}
