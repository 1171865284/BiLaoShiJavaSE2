package day26.net.TCP;

/*
 * 程序功能：网络编程---TCP文本文件的上传
 * 程序员：魏国平
 * 编写时间：3月18
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// 1.socket服务的开启
		Socket s = new Socket("192.168.1.103", 10010);

		// 2.源目的
		BufferedReader bufr = new BufferedReader(new FileReader("G:\\client.txt"));

		// 3.输出流
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);

		String line = null;

		while ((line = bufr.readLine()) != null) {	
			out.println(line);
		}
		
		out.println("over");

		// 4.读取socket
		BufferedReader buIn = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String str = buIn.readLine();
		System.out.println(str);
		
		s.close();
		bufr.close();
	}

}
