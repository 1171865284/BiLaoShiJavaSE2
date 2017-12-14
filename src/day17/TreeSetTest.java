package day17;

import java.util.Iterator;
import java.util.TreeSet;

import day17.been.ComparatorBylength;

/*
 * 程序功能：TreeSet集合字符串长度排序
 * 程序员：魏国平
 * 编写时间：12月13日
 */

/*
 *对字符串进行比较 
 */
public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts = new TreeSet(new ComparatorBylength());
		
		ts.add("aaaaa");
		ts.add("zz");
		ts.add("nbag");
		ts.add("cba");
		ts.add("abc");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
