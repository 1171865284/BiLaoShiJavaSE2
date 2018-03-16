package day26.chat;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Chat {

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub

		
		DatagramSocket send = new DatagramSocket();
		DatagramSocket rece = new DatagramSocket(10000);
		
		Send s = new Send(send);
		Rece r = new Rece(rece);
		
		new Thread(s).start();
		new Thread(r).start();
		
	}

}
