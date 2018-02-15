package io;

import java.io.FileReader;
import java.io.IOException;

/*
 * 程序功能：自定义BufferedReader
 * 程序员：魏国平
 * 编写时间：2月12日
 */

public class MyBufferedReader {

	//调用FileReader类
	private FileReader r;
	
	//定义一个全局数组
	char[] buf = new char[1024];
	
	//定义一个数组来操作源中的数据，当操作到了最后一个元素的时候，指针应该归0
	private int pos = 0;
	
	//我来做一个计数器,当数组见到0的时候有我们从源中获取数据存储到缓冲区中
	private int count = 0;

	public MyBufferedReader(FileReader r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	
	public int myRead() throws IOException{
		
		if (count == 0) {
			//如果count是0的话就代表缓冲区中空了，所以我们要向数据源中拿去数据(buf)
			count = r.read(buf);
			//我们使用pos来计数看一个一个拿拿了多少个，是否拿空了
			pos = 0;
		}
		if (count < 0) {
			//如果count小于0那代表数据源已经读取完毕，收工回家
			return -1;
		}
		
		//我是用char字符来读取缓冲区（buf）中的pos，一个一个的读取
		char ch = buf[pos];
		//读一个我们加一个计数器
		pos++;
		//而count（缓冲区）中的数据就少一个
		count--;
		
		//我们一个个返回数据
		return ch;
		
		
		/*//我们从源中获取数据，如果count为0，就又要从源中获取数据到缓冲区中了
		//每次我们都会榨取一批数据
		if (count == 0) {
			r.read(buf);
			
			if (count < 0) {
				return -1;
			}
			
			//每次缓冲区后角标都归0
			pos = 0;
			char ch = buf[pos];
			
			pos++;
			count--;
			
			return ch;
		}else if (count > 0) {
			
			pos = 0;
			//每次读取一个
			char ch = buf[pos];
			
			pos++;
			count--;
		}*/
		
		
	}
	
	public String myReadLine() throws IOException{
		
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		
		while((ch = myRead()) != -1){
			
			
			if (ch == '\r' ) {
				//结束循环
				continue;
			}
			if (ch == '\n') {
				return sb.toString();
			}
			
			//从缓冲区中的字符，将缓冲行中的数据存储到缓冲区中
			sb.append((char)ch);
			
		}
		
		if (sb.length() != 0) {
			return sb.toString();
		}
		
		return null;
	}
	
	public void myclose() throws IOException{
		r.close();
	}

}
