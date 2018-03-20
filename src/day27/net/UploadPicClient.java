package day27.net;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 程序功能：网络编程--- 图片的上传--客户端
 * 程序员：魏国平
 * 编写时间：3月18日
 */

public class UploadPicClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		//创建客户端socket
		Socket s = new Socket("192.168.10.31",10008);
		
		//读取客户端要上传的文件
		FileInputStream fis = new FileInputStream("G:\\TCP-pic\\client.jpg");
		//获取socket输出流的图片文件
		OutputStream out = s.getOutputStream();
		
		byte [] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1){
			out.write(buf, 0, len);
		}
		
		//告诉服务端数据已经传输完毕
		s.shutdownInput();
		//没有以下步骤可以正常运行
		//读取服务端发挥的内容
		/*InputStream in = s.getInputStream();
		byte[] buIn = new byte[1024];
		int lenIn = in.read(buIn);
		String text = new String(buIn, 0, lenIn);*/
		
		s.close();
		
		
	}

}
