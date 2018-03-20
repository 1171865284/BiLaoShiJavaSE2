package day27.net;

/*
 * 程序功能：网络编程--- 图片的上传---服务端
 * 程序员：魏国平
 * 编写时间：3月18
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 创建TCP的socket服务端
		ServerSocket ss = new ServerSocket(10008);
		
		while(true){
			// 获取客户端
			Socket s = ss.accept();
			new Thread(new UploadTask(s)).start();
		}
	}

}
