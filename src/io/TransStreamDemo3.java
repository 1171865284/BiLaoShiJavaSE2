package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TransStreamDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readText_2();
	}

	private static void readText_2() throws IOException {
		// TODO Auto-generated method stub
		
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\gbk_2.txt"), "gbk");
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("G:\\gbk_2.txt"), "gbk"));
		
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len = bufr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		
		
		
	}

	private static void readText_1() throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("G:\\gbk_1.txt");
		
		BufferedReader bufr = new BufferedReader(fr);
		
		char[] buf = new char[1024];
		
		int len = 0;
		
		while((len = bufr.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}
		
	}

	private static void writeText_2() throws IOException {
		// TODO Auto-generated method stub
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\gbk_2.txt"), "gbk");
		
		osw.write("你好");
		
		osw.close();
	}

	private static void writeText_1() throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("G:\\gbk_1.txt");
		
		fw.write("你好");
		
		fw.close();
	}

}
