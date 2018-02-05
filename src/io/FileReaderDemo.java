package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//一个一个读取字符
		//首先要读取到指定的文件
		FileReader fr = new FileReader("G:\\HelloWorld.txt");
		
		int ch = 0;
		
		while((ch = fr.read()) != -1){
			System.out.println((char)ch);
		}
	}

}
