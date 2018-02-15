package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 程序功能：字节流的复制
 * 程序员：魏国平
 * 编写时间：2月14日
 */

public class CopyMP3Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Copy_3();
		
	}

	//可以用于小文件的copy但是大文件就会溢出的危险
	private static void Copy_3() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("G:\\0.mp3");
		
		FileOutputStream fos = new FileOutputStream("G:\\3.mp3");
		
		byte[] buf = new byte[fis.available()];
		
		fis.read(buf);
		fos.write(buf);
		
		fis.close();
		fos.close();
		
		
	}

	private static void Copy_2() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("G:\\0.mp3");
		BufferedInputStream bufis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("G:\\2.mp3");
		BufferedOutputStream bufos = new BufferedOutputStream(fos);
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len = bufis.read(buf)) != -1){
			bufos.write(buf, 0, len);
		}
		
		bufis.close();
		bufos.close();
	}

	private static void Copy_1() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("G:\\0.mp3");
		
		FileOutputStream fos  = new FileOutputStream("G:\\1.mp3");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len = fis.read(buf)) != -1){
			fos.write(buf, 0, len);
		}
		
		fis.close();
		fos.close();
		
		
	}

}
