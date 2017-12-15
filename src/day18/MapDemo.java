package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import day7.StaticCodeDemo;

/*
 * 程序功能：集合框架--Map常用方法演示
 * 程序员：魏国平
 * 编写时间：12月14日
 */

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		method_2(map);
	}
	
	public static void method_2(Map<Integer, String>map){
		
		map.put(8, "wangwu");
		map.put(2, "zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(6, "wangcai");
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		
		/*
		 * 通过Map转成set就可以迭代
		 * 找到另一个方法。entrySet。
		 * 该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射类型就是Map, Entry类型（结婚证）
		 * 
		 */
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		//调用迭代器
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> me = it.next();
		}
		
		
		
		//取出map中的所有元素
		//原理，通过keySet方法获取map中所有的键所在的Set集合，在通过Set的迭代器获取每一个键。
		//在对每一个键通过map集合的get方法获取其对应的值即可。
		
		/*Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while (it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}*/
		
		
	}

	// 学号和姓名
	public static void method(Map<Integer, String> map)
	{
		//添加元素
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xiaoqiang"));//wangcai	存相同键，值会覆盖。
		map.put(2, "zhangsan");
		map.put(7, "zhaoliui");
		
		//删除元素
//		System.out.println("remove:" + map.remove(2));
		
		//判断
//		System.out.println("containskey:" + map.containsKey(7));
		
		//获取
		System.out.println("get:" + map.get(7));
		
		System.out.println(map);
		
		Outer.Inner.show();
	}
}

//内部接口
interface MyMap{
	interface MyEntry{
		static void show(){
			
		}
	}
}

class MyDemo implements MyMap.MyEntry
{
	public void get(){}
}

//内部类
class Outer
{
	static class Inner{
		static void show(){}
	}
}