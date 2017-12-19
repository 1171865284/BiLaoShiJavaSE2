package day19;

/*
 * 程序功能：静态导入
 * 程序员：魏国平
 * 编写时间：12月19日
 */
/*
 * 静态导入其实导入的是类中的静态成员。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Collections.*;
import static java.lang.System.*;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new  ArrayList<String>();
		
		list.add("abc3");
		list.add("abc7");
		list.add("abc1");
		
		out.println(list);
		
		sort(list);
		
		System.out.println(list);
		
		String max = max(list);
		System.out.println("max = " + max);
		
		
	}

}
