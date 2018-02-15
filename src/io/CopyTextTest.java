package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：文本文件的copy
 * 程序员：魏国平
 * 编写时间：2018年2月5日
 */

public class CopyTextTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//先要读取一个已有的文本文件
		FileReader fr = new FileReader("G:\\HelloWorld.txt");
		//创建一个目的地用于存储读到的数据
		FileWriter fw = new FileWriter("G:\\CopyText.txt");
		//进行读写操作
		int ch = 0;
		//读取操作
		while((ch = fr.read())!= -1){
			//写入操作
			fw.write(ch);
		}
		//关闭数据流
		fw.close();
		fr.close();
	}

}
