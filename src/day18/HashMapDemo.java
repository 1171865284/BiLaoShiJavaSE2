package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import day18.been.Student;

/*
 * 程序功能：HashMap存储自定义对象
 * 程序员：魏国平
 * 编写时间：12月14日
 */

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 将学生对象和学生的归属地通过检核值存储到map集合中。
		 */
		
		HashMap<Student, String> hm = new HashMap<Student, String>();
		
		hm.put(new Student("lisi", 38), "北京");
		hm.put(new Student("zhaoliu", 24), "上海");
		hm.put(new Student("xiaoqiang", 31), "沈阳");
		hm.put(new Student("wangcai", 28), "大连");
		hm.put(new Student("wangcai", 28), "成都");
		
//		Set<Student> keySet = hm.keySet();
//		Iterator<Student> it = keySet.iterator();
		
		Iterator<Student> it = hm.keySet().iterator();
		
		while(it.hasNext())
		{
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName() + ":" + key.getAge() + "--" + value);
		}
	}

}
