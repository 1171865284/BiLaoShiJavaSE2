package day17.been;


/*
 * 程序功能：自己写的工具类
 * 程序员：魏国平
 * 编写时间：12月10日
 */

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;

	public DuiLie() {
		// TODO Auto-generated constructor stub
		link = new LinkedList();
	}

	/*
	 * 队列的添加元素的功能.
	 */
	public void myAdd(Object obj) {
		link.addLast(obj);
	}

	public Object myGet() {
		return link.removeFirst();
	}

	public boolean isNull() {
		return link.isEmpty();
	}
}
