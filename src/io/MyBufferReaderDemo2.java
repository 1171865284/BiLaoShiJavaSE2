package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 程序功能：BufferReader案例演示
 * 程序员：魏国平
 * 编写时间： 2018年2月11日
 */


public class MyBufferReaderDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileReader fr = new FileReader("G:\\buf.txt");
		
		MyBufferedReader bufr = new MyBufferedReader(fr);
		
		String len = null;
		
		while((len = bufr.myReadLine()) != null){
			System.out.println(len);
		}
		
		bufr.myclose();
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("G:\\buf.txt");
		
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		
		fr.close();
	}

}
