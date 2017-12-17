package day19;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 程序功能：LinkedHashMap的使用
 * 程序员：魏国平
 * 编写时间：12月16日
 */

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//在HashMap前加上Linked就会使输出有序
		HashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(7, "zhouqi");
		hm.put(3, "zhangsan");
		hm.put(1, "qianyi");
		hm.put(5, "wangwu");
		
		Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, String> me = it.next();
			
			Integer key = me.getKey();
			String value = me.getValue();
			
			System.out.println(key + ":" + value);
		}

	}

}
