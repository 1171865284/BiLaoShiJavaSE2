package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//字节流输出打印
		InputStream in = System.in;
		
		//字节流转换为字符流的转换桥梁InputStreamReader,转换的桥梁
		InputStreamReader isr = new InputStreamReader(in);
		
		//字符流缓冲区
		BufferedReader bufr = new BufferedReader(isr);
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			if ("over".equals(line)) {
				break;
			}
			System.out.println(line.toUpperCase());
		}
	}

}
