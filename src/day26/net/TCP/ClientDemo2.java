package day26.net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 程序功能：网络编程---TCP---客户端
 * 程序员：魏国平
 * 编写时间：3月16日
 */

public class ClientDemo2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		//创建TCP客户端Socket服务
		Socket socket = new Socket("192.168.7.8", 10009);
		
		//建立成功后创建输出流对象
		OutputStream out = socket.getOutputStream();
		
		//使用输出流写入对象
		out.write("TCP，我有回来了Socket......".getBytes());
		
		//读取服务端返回的数据，使用socket读取
		InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf, 0, len);
		System.out.println(text);
		
		//关闭资源
		socket.close();
		
		
	}

}
