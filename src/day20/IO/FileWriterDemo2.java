package day20.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：IO流----FileWriter类的使用
 * 程序员：魏国平
 * 编写时间：208年1月28日
 */
public class FileWriterDemo2 {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//调用FileWriter类创建Demo.txt文本文件，若是有的话就覆盖, 若是加一个true的话就能达到一个续写的功能
		FileWriter fileWriter = new FileWriter("Demo.txt",true);
		
		//使用write()方法写入数据
		fileWriter.write("abcde"+ LINE_SEPARATOR+"你好吗？");
		fileWriter.write("mk");
		//使用close()方法关闭流同时进行刷新
		fileWriter.close();
		
	}

}
