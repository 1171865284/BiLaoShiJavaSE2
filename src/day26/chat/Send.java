package day26.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send implements Runnable {

	private DatagramSocket ds;

	public Send(DatagramSocket ds) {
		super();
		this.ds = ds;
	}

	@Override
	public void run() {

		try {
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

			String line = null;

			while ((line = bufr.readLine()) != null) {

				if ("over".equals(line)) {
					break;
				}
				// 将要发送的数据封装起来
				// String str = "这就是我们要发送的数据啦！";

				// 我们使用Datagrampacket封装到数据保包
				byte[] buf = line.getBytes();
				// 要确定发送的IP地址正确，和明确端口号
				DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.7.8"), 10000);

				// 3.通过UDP的socket服务将数据包发送出去
				ds.send(dp);
			}

			// 4.将sockt服务关闭
			ds.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
