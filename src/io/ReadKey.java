package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadKey {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readKey_1();
	}

	private static void readKey_2() throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 我们要做的功能是把输出的字符变为字符串
		 * 然后把这些字符串输出之后打印在控制台上时，都是大写的
		 * 最后我们要得到一个命令关闭这个流
		 */
		
		//先做一个字符串缓冲区
		StringBuilder sb = new StringBuilder();
		
		//我们创建录入的对象
		InputStream in = System.in;
		
		//创建一个变量，进行循环
		int ch = 0;
		
		while((ch = in.read()) != -1){
			
			if (ch == '\r') {
				continue;
			}
			if (ch == '\n') {
				String temp = sb.toString();
				if ("over".equals(temp)) {
					break;
				}
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else
				//将读取到的数据存储到缓冲区中
				sb.append((char)ch);
			
		}
		
	}

	private static void readKey_1() throws IOException {
		// TODO Auto-generated method stub
		
//		InputStream in = System.in;
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
//		int ch = 0;
//		
////		System.out.println((char)ch);
//		
//		while((ch = in.read()) != -1){
//			System.out.println((char)ch);
//		} 
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			if ("over".equals(line)) {
				break;
			}else {
				System.out.println(line.toUpperCase());
			}
		}
		
		bufr.close();
	}

}
