package day21.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：IO字符流---字符串缓冲去---BufferedWriter
 * 程序员：魏国平
 * 编写时间：12月25日
 */

public class BufferedWriterDemo {
	
	//换行的作用
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("buf.txt");
		
		//为了提高写入效率，使用字符流的缓冲区。
		//创建一个字符写入流的缓冲对象，并与指定的流的对象相关联
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//使用缓冲区方法写入将数据先写入到缓冲区中
//		bufw.write("abcde"+LINE_SEPARATOR+"hahahaha");
//		bufw.write("hehehehe");
		//换行方法
//		bufw.newLine();
//		bufw.write("hahaha");
		
		
		for(int x = 1; x <= 4; x++){
			bufw.write("abcdef" + x);
			bufw.newLine();
			bufw.flush();
		}
		
		//使用缓冲区的刷新方法将数据刷新到目的地中。
//		bufw.flush();
		
		
		
		//关闭缓冲区，其实关闭的就是被缓冲的流对象。
		bufw.close();
		
	}

}
