package day26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 程序功能：网络编程----UDP传输接受端
 * 程序员：魏国平
 * 编写时间：3月15日
 */

/*
 * 思路：
 * 	1.创建UDP的socket服务
 * 	2.创建数据包用来存储数据
 * 	2.使用socket服务的receive方法将接受到的数据存储到数据包中
 * 	3.将数据包解析
 * 	4.socket服务关闭
 */

public class UDPReceDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("UDP接收端启动。。。。。。。。");

		//创建UDP的socket服务
		//接收的端口号也要明确
		DatagramSocket ds = new DatagramSocket(10000);
		
		//创建数据包用来存储数据
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		//使用socket服务的receive方法将数据存储起来
		ds.receive(dp);
		
		//使用数据包中的方法将数据解析，例如：数据包的IP地址，端口号，内容
		String IP = dp.getAddress().getHostAddress();
		int pro = dp.getPort();
		String text = new String(dp.getData(), 0, dp.getLength());
		
		System.out.println(IP + ":" + pro + ":" + text);
		
		//关闭socket服务
		ds.close();
	}

}
