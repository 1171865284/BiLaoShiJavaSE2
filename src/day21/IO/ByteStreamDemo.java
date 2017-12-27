package day21.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		demo_read();
		
	}

	public static void demo_read() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("byteDemo.txt");
		
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		System.out.println(new String(buf));
		
		//输出文件的字节大小
//		System.out.println(fis.available());
		
	/*	//一次输出一个字符串'
	 * 建议使用这种方法读取数据
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1){
			System.out.println(new String(buf, 0, len));
		}*/
		
		/*int len = 0;
		while((len = fis.read()) != -1){
			System.out.println((char)len);
		}*/
		
		//一次读取一个字节
		/*int ch = fis.read();
		System.out.println((char)ch);*/
		
		fis.close();
	}

	public static void demo_write() throws IOException {
		// TODO Auto-generated method stub
		
		//创建字节输出流对象，用于操作文件
		FileOutputStream fos = new FileOutputStream("byteDemo.txt");
		
		fos.write("abcde".getBytes());
		
		//关闭
		fos.close();
		
	}

}
