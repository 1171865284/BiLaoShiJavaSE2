package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import day19.bean.ComparatorBylength;

/*
 * 程序功能：Collections集合工具类
 * 程序员：魏国平
 * 编写时间：12月18日
 */

/*
 * Collections:是集合框架的工具类
 * 里面的方法都是静态的。
 */

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo_4();
	}

	public static void demo_4() {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		
		System.out.println(list);
		//前面是要替换的字符串，后面是替换的字符串
//		Collections.replaceAll(list, "aa", "你大爷");
		//使用指定元素替换指定列表中的所有元素。
//		Collections.fill(list, "你大爷的");
		//使用默认随机源对指定列表进行置换。
		Collections.shuffle(list);
		System.out.println(list);
	}

	public static void demo_3() {
		// TODO Auto-generated method stub
		
		
		//使用Collections类中的reverseOrder()方法完成了逆转倒序的的功能
//		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());

		//这样做呢，就可以把比较长度的自定义方法给逆序了。
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorBylength()));
		
		ts.add("abc");
		ts.add("hahahaha");
		ts.add("zzz");
		ts.add("aa");
		ts.add("cba");
		
		
		System.out.println(ts);
	}

	public static void demo_2() {
		List<String> list = new ArrayList<String>();

		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzzz");
		list.add("nbaa");
		Collections.sort(list);
		System.out.println(list);
		
//		int index = Collections.binarySearch(list, "aa");
//		System.out.println("index=" + index);//-2
		//为啥是-2呢？负是因为没找到，2是插入点它是插到第二个里面排第二。
		
		//获取最大值
		String max = Collections.min(list, new ComparatorBylength());
		System.out.println(max);
	}

	public static void demo_1() {
		List<String> list = new ArrayList<String>();

		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zzzz");
		list.add("nbaa");
		System.out.println(list);

		// 对list集合进行制定顺序的排序
		// Collections.sort(list);
		// System.out.println(list);
		// mySort(list);
		mySort(list, new ComparatorBylength());
		System.out.println(list);
	}

	public static <T> void mySort(List<T> list, Comparator<T> comp) {

		// 使用for循环进行排序
		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (comp.compare(list.get(i), list.get(j)) > 0) {

					/*
					 * T temp = list.get(i); list.set(i, list.get(j));
					 * list.set(j, temp);
					 */

					Collections.swap(list, i, j);

				}
			}
		}

	}

	public static <T extends Comparable<? super T>> void mySort(List<T> list) {

		// 使用for循环进行排序
		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).compareTo(list.get(j)) > 0) {

					/*
					 * T temp = list.get(i); list.set(i, list.get(j));
					 * list.set(j, temp);
					 */

					Collections.swap(list, i, j);

				}
			}
		}

	}
}
