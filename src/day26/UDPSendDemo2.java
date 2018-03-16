package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 程序功能：网络编程的UDP传输
 * 程序员：魏国平
 * 编写时间：3月15日
 */

/*
 * 创建UDP传输的发送端
 * 思路：
 * 1.创建udp的socket服务
 * 2.将要发送的数据封装到数据包中。
 * 3.通过udp的socket服务将数据包发送出去
 * 4.关闭socket服务
 */
public class UDPSendDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("UDP发送端启动.......");

		//创建UDP的socket服务，使用DatagramSocket类
		//发送的端口号要明确
		DatagramSocket ds = new DatagramSocket(8888);
		
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			
			if ("over".equals(line)) {
				break;
			}
			//将要发送的数据封装起来
//			String str = "这就是我们要发送的数据啦！";
			
			//我们使用Datagrampacket封装到数据保包
			byte [] buf = line.getBytes();
			//要确定发送的IP地址正确，和明确端口号
			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.7.8"), 10000);
			
			//3.通过UDP的socket服务将数据包发送出去
			ds.send(dp);
		}
		
		
		
		//4.将sockt服务关闭
		ds.close();
	}

}
