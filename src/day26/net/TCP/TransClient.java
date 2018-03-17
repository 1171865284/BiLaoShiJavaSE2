package day26.net.TCP;

/*
 * 程序功能：文本转换客户端-----在客户端输出字符----在服务端大写输出
 * 程序员：魏国平
 * 编写时间：3月7日
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		// 创建客户端socket
		Socket s = new Socket("192.168.7.8", 10004);

		//获取键盘录入
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		//socket输出流
//		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		
		//socket输入流
		BufferedReader buIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line = bufr.readLine()) != null){
			
			if ("over".equals(line)) {
				break;
			}
			out.println(line.toUpperCase());
			
			String str = buIn.readLine();
//			System.out.println(str.toUpperCase());
		}
		
		s.close();

	}
}
