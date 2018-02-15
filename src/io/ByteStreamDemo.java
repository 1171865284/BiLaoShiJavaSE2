package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 程序功能：字节流的使用
 * 程序员：魏国平
 * 编写时间：2月14日
 */

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Byte_Read();
	}

	private static void Byte_Read() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("G:\\byteOut.txt");
		
//		byte[] buf = new byte[1024];
		
//		int len = 0;
//		while((len = fis.read(buf)) != -1){
//			System.out.println(new String(buf, 0, len));
//		}
		
//		System.out.println(fis.available());
		
		byte[] buf = new byte[fis.available()];
		
		fis.read(buf);
		System.out.println(new String(buf));
		
		fis.close();
	}

	private static void Byte_Write() throws IOException {
		// TODO Auto-generated method stub
		
		//创建一个字节流输出对象，用于操作文件
		FileOutputStream fos = new FileOutputStream("G:\\byteOut.txt");
		
		fos.write("你好啊！".getBytes());
		
		fos.close();
		
	}

}
