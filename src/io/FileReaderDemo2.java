package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//将字符数据存储到数组中读取
		FileReader fr = new FileReader("G:\\HelloWorld.txt");
		
		//创建一个数组
		char[] buf = new char[1024];
		
		int len = 0;
		
		//进行读取操作
		while((len = fr.read(buf)) != -1){
			System.out.println(new String(buf));
		}
		
		
	}

}
