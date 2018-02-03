package day20.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 程序功能：IO流-----Reader的使用
 * 程序员：魏国平
 * 编写时间：12月24日
 */

/*
 * 需求：读取一个文本文件，将读取到的字符打印到控制台。
 */

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.创建读取字符数据的流对象
		/*
		 * 在创建读取流对象时，必须要明确被读取的文件。一定要确定该文件是存在的。
		 * 
		 * 用一个读取流关联一个已存在文件
		 */
		//这个方法是一次读一个
		//首先我们使用FileReader类来读取数据
		FileReader fr = new FileReader("demo.txt");//读取我们需要读取的文件
		
		//因为读取的数据都是二进制数字，所以我们设置一个二进制数字做为变量
		int ch = 0;
		//再使用while循环来读取demo.txt中的数据
		while((ch=fr.read())!= -1){
			
			//进行while循环一直读下去，一直读到-1为止
			System.out.println((char)ch);
		}
		
		//关闭数据
		fr.close();

	}

}
