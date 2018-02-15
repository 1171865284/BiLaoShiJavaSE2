package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 程序功能：缓冲区复制文本文件
 * 程序员：魏国平
 * 编写时间：2018年2月12日
 */

public class BufferCopyText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		demo_2();
		
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void demo_2() throws FileNotFoundException, IOException {
		//使用FileReader对象和buf.txt文件相关联
		FileReader fr = new FileReader("G:\\buf.txt");
		//创建BufferedReaded缓冲区
		BufferedReader bufr = new BufferedReader(fr);
		
		//使用FileWriter类将数据写到目的地中
		FileWriter fw = new FileWriter("G:\\bufCopy.txt");
		//穿件BufferedWriter缓冲区将数据存储到缓存区中
		BufferedWriter bufw = new BufferedWriter(fw);
		
		//创建String类变量
		String len = null;
		
		//进行while循环判断bufr.readLine()一行一行的读取这样的话直接督导null为止就结束循环读取咯
		while((len = bufr.readLine())!= null){
			bufw.write(len);
			//我们使用缓冲区中的方法newLine()
			bufw.newLine();
			//刷新缓冲区
			bufw.flush();
		}
		
		//关闭数据流
		bufr.close();
		bufw.close();
	}

	/**
	 * 
	 */
	public static void demo_1() {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("G:\\buf.txt");
			fw = new FileWriter("G:\\bufCopy.txt");
			
			BufferedReader bufr = new BufferedReader(fr);
			BufferedWriter bufw = new BufferedWriter(fw);
			
			char[] buf = new char[1024];
			
			int len = 0;
			
			while((len = bufr.read(buf)) != -1){
				bufw.write(buf, 0, len);
				bufw.flush();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("数据读取失败");
		}
		finally {
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
