package day26.net.TCP;

/*
 * 程序功能：网络编程---TCP文本文件的上传
 * 程序员：魏国平
 * 编写时间：3月18
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1.创建socket服务使用Serversocket对象
		ServerSocket ss = new ServerSocket(10010);
		
		//2.获取socket对象
		Socket s = ss.accept();//阻塞
		System.out.println(s.getInetAddress().getHostAddress() + "......connected");
		//3.传输数据源
		BufferedReader buIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.写入客户端的数据
		BufferedWriter bufw = new BufferedWriter(new FileWriter("G:\\server.txt"));
		
		//5.这个里我们就是写入数据
		String line = null;
		
		while((line = buIn.readLine()) != null){
			if ("over".equals(line)) {
				break;
			}
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		out.println("上传成功");
		
		bufw.close();
		
		s.close();
		ss.close();

	}

}
