package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：字符缓冲区----BufferWriter
 * 程序员：魏国平
 * 编写时间：2018年2月11日
 */
public class BufferWriterDemo {

	private static final String LINESEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("G:\\buf.txt");
		
		//为了提高写入效率我们要创建一个字符流缓冲区，接下来我们就要创建一个字符流缓冲区
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//bufw.write("abc" + LINESEPARATOR + "jkl");
		
		//我们有一个缓冲区中的自带换行方法
		//bufw.newLine();
		//bufw.write("ccc");
		
		//使用刷新来刷入缓冲区中
		//bufw.flush();
		
		for(int x = 1; x <= 4; x++)
		{
			bufw.write("abcd" + x);
			bufw.newLine();
			bufw.flush();
		}
		
		//关闭缓冲区就是关闭缓冲区中的流对象
		bufw.close();
	}

}
