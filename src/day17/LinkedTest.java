package day17;

import java.util.LinkedList;

import day17.been.DuiLie;

/*
 * 程序功能：LinkedList练习
 * 程序员：魏国平
 * 编写时间：12月10
 */

/*
 * 请使用LinkedList来模拟一个堆或者队列数据结构.
 * 
 * 堆栈:先进后出First In Last Out FIlO
 * 
 * 队列:先进先出First In Fist Out FiFO
 * 
 * 我们应该描述这样一个容器，给使用提供一个容器对象完成这两种结构中的一种.
 */
public class LinkedTest {

	public static void main(String[] args) {
		DuiLie dl = new DuiLie();
		
		dl.myAdd("abc1");
		dl.myAdd("abc2");
		dl.myAdd("abc3");
		dl.myAdd("abc4");
		
		while(!dl.isNull())
		{
			System.out.println(dl.myGet());
		}
	}

}
