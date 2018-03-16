package day26.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Rece implements Runnable {

	private DatagramSocket ds;

	public Rece(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while (true) {
				// 创建数据包用来存储数据
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);

				// 使用socket服务的receive方法将数据存储起来
				ds.receive(dp);

				// 使用数据包中的方法将数据解析，例如：数据包的IP地址，端口号，内容
				String IP = dp.getAddress().getHostAddress();
				int pro = dp.getPort();
				String text = new String(dp.getData(), 0, dp.getLength());

				System.out.println(IP + ":" + pro + ":" + text);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
