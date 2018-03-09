package day23.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * 程序功能：PrintWriter的使用
 * 程序员：魏国平
 * 编写时间：2018年3月9日
 */

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw = new PrintWriter("G:\\PrintW.txt");
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			
			if ("over".equals(line)) {
				break;
			}
			
			pw.println(line.toUpperCase());
			
			//刷新要不无法答应出来
			pw.flush();
		}
		bufr.close();
		pw.close();
	}
}
