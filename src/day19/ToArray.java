package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 程序功能：集合转数组
 * 程序员：魏国平
 * 编写时间：12月19日
 */

/*
 * 集合转数组怎样转？？？
 * 
 *  使用toArray()方法
 *  
 *  使用的就是Collections接口中的 toArray方法。
 *  
 *  集合转成数组：可以对集合中的元素操作的方法进行限定。不允许对其进行增删。
 *  
 *  toArray方法需要传入一个制定类型的数组。
 *  长度如何定义呢？
 *  如果长度小于集合的size，那么该方法会创建一个同类型并和集合相同size的数组
 *  
 *  所以建议，最后长度就指定为，集合的size。
 */

public class ToArray {
	
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		String[] arr = list.toArray(new String[list.size()]);
		
		//把集合中的元素放到数组中去了
		System.out.println(Arrays.toString(arr));
	}

}
