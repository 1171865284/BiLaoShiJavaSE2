package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 接下来我们写三个需求：
		 * 
		 * 需求1：将键盘录入的数据写入到一个文件中
		 * 
		 * 需求2:将一个文件的数据显示到控制台中
		 * 
		 * 需求3：将一个文本复制
		 */

		//缓冲区，使字节流转换为字符流
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("G:\\HelloWorld.txt")));
		
		//缓冲区，使字符流转换为字节流
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G:\\b.txt")));
		
		//创建一个空字符串
		String line = null;
		
		//对line中的数据进行读取
		while((line = bufr.readLine()) != null){
			if ("over".equals(line)) {
				break;
			}
			
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
	}

}
