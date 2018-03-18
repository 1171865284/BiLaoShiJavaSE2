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
		// 获取客户端
		Socket s = ss.accept();
		// 读取客户端发的数据
		InputStream in = s.getInputStream();
		// 键获读取到数据存储到一个文件中
		File dir = new File("G:\\TCP-pic");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, "server.jpg");
		FileOutputStream fos = new FileOutputStream(file);
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = in.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		//没有以下步骤可以正常运行
		// 获取socket输出流，将上传成功的字样发挥客户端
		/*OutputStream out = s.getOutputStream();
		out.write("上传成功".getBytes());*/

		fos.close();
		s.close();
		ss.close();
	}

}
