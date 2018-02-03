package day20.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 程序功能：IO流-----使用read(char[])读取文本文件数据
 * 程序员：魏国平
 * 编写时间：12月24日
 */

public class FileReadDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		FileReader fr = new FileReader("demo.txt");
		
		/*
		 * 使用read(char[])读取文本文件数据。
		 * 
		 * 先创建字符数组。
		 */
		/*char[] buf = new char[1024];
		
		int len = 0;
		
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		
		int num = fr.read(buf);//将读取到的字符存储到数组中。
		System.out.println(num + ":" + new String(buf, 0 ,num));
		int num1 = fr.read(buf);//将读取到的字符存储到数组中。
		System.out.println(num1 + ":" + new String(buf, 0, num1));
		int num2 = fr.read(buf);//将读取到的字符存储到数组中。
		System.out.println(num2 + ":" + new String(buf, 0, num2));
		
		fr.close();*/
		
		FileReader fr = new FileReader("demo.txt");
		
		//这是个数据读取方式是以数组的形式都出来的
		//首先我们要创建一个数据
		char[] buf = new char[1024];//这个数组的长度我们可以自己写，无所谓
		
		int len = 0;
		while((len = fr.read(buf)) != -1)
		{
			System.out.println(new String(buf, 0, len));
		}

	}

}
