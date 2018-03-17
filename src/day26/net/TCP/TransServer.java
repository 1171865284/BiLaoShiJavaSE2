package day26.net.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 程序功能：文本转换客户端
 * 程序员：魏国平
 * 编写时间：3月7日
 */

public class TransServer {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		/*
		 * 1.serversocket服务
		 * 2.获取socket对象
		 * 3.源：socket，读取客户端发过来的需要转换的数据
		 * 4.目的：控制台
		 * 5.将数据转成大写发给客户端
		 */
		//1.
		ServerSocket ss = new ServerSocket(10004);
		
		//2.获取socket对象
		Socket s = ss.accept();
		
		//3.获取socket读取流
		BufferedReader buIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//4.获取socket输出流
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		String line = null;
		while((line = buIn.readLine()) != null){
			System.out.println(line);
			out.println(line);
		}
		s.close();
		ss.close();
	}

}
