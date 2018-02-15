package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * 程序功能：LineNumberReader---读行号
 * 程序员：魏国平
 * 编写时间：2月13日
 */

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("IO流笔记.txt");
		
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line = null;
		lnr.setLineNumber(100);
		
		while((line = lnr.readLine()) != null){
			System.out.println(lnr.getLineNumber() + ":" +line);
		}
		
		lnr.close();
		
	}

}
