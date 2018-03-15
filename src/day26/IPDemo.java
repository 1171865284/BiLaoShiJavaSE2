package day26;

/*
 * 程序功能：网络编程---获取本机ip地址
 * 程序员：魏国平
 * 编写时间：3月15日
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		//获取本地主机IP地址对象
		InetAddress ip = InetAddress.getLocalHost();
		
//		//获取其他主机的IP地址对象
		ip = InetAddress.getByName("www.Google.com");
//		ip = InetAddress.getByName("10.1.1.1");
		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
	}

}
