package day27.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyBrowser {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket s = new Socket("192.168.10.31", 9000);
		
		//模拟浏览器给tomcat发送http协议
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		out.println("Host:");
		out.println("Connection:");
		out.println("Connection:");
		out.println("");
		out.println("");
		
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		//因为比较小够用我们就不写循环了
		int len = in.read(buf);
		String str = new String(buf, 0, len);
		System.out.println(str);
		
		s.close();
		
		
	}

}
