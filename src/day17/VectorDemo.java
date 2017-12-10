package day17;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * 程序功能：Vector方法的使用
 * 程序员：魏国平
 * 编写时间：12月10日
 */

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println("nextelment:" + en.nextElement());
		}
		
		Iterator iterator = v.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println("next:" + iterator.next());
		}
	}

}
